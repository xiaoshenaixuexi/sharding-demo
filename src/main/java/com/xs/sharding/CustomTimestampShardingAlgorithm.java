package com.xs.sharding;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.*;

/**
 * ClassName: CustomTimestampShardingAlgorithm
 * Package: com.xs.sharding
 * Description:
 *
 * @Author 高伟
 * @Create 2025/4/9 10:22
 * @Version 1.0
 */

@Slf4j
@Getter
public class CustomTimestampShardingAlgorithm implements StandardShardingAlgorithm<Long> {

    private final ThreadLocal<SimpleDateFormat> formatThreadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy"));

    private Properties props;

    /**
     * 设置该参数的原因是，如果在范围查找的时候我们没有设置最小值，比如下面的查询
     * where acquisition_time < '2022-08-11 00:00:00'
     * 这个时候范围查找就只有上限而没有下限，这时候就需要有一个下限值兜底，不能一致遍历下去
     */
    private Long tableLowerTimestamp;

    /**
     * 精确路由算法
     * 根据此处计算得知具体路由到哪张实际存储表中
     * @param availableTargetNames 可用的表集合（配置文件中: actual-data-nodes 解析得到）
     * @param shardingValue 精确值
     * @return
     */
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Long> shardingValue) {
        Long value = shardingValue.getValue();
        // 获取路由表
        String actualTableName = shardingValue.getLogicTableName() + "_" + this.shardingSuffix(value);
        if(availableTargetNames.contains(actualTableName)) {
            return actualTableName;
        }
        return null;
    }

    /**
     * value 是 Long 型时间戳
     * @param value
     * @return
     */
    private String shardingSuffix(Long value) {
        return formatThreadLocal.get().format(new Date(value));
    }

    /**
     * 范围路由算法
     * @param availableTargetNames 可用的表集合（配置文件中: actual-data-nodes 解析得到）
     * @param rangeShardingValue 范围值
     * @return
     */
    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<Long> rangeShardingValue) {
        // 获取到范围查找最小值，如果条件中没有最小值 设置为 tableLowerTimestamp
        Long rangeLowerTimestamp;
        if(rangeShardingValue.getValueRange().hasLowerBound()) {
            rangeLowerTimestamp = rangeShardingValue.getValueRange().lowerEndpoint();
        } else {
            rangeLowerTimestamp = this.tableLowerTimestamp;
        }

        // 获取到范围查询最大值，如果没有配置最大值，设置为下一年的时间戳 - 1 毫秒
        Long rangeUpperTimestamp = 0l;
        if(rangeShardingValue.getValueRange().hasUpperBound()) {
            rangeUpperTimestamp = rangeShardingValue.getValueRange().upperEndpoint();
        } else {
            try {
                Year year = Year.now().plusYears(1);
                int nextYear = year.getValue();
                Date nextDate = formatThreadLocal.get().parse(String.valueOf(nextYear));
                rangeUpperTimestamp = nextDate.getTime() - 1;
            } catch (Exception e) {
                log.error("parse next year date failed: ", e);
            }
        }
        // 获取实际执行表名
        List<String> actualTableNames = new ArrayList<>();
        while(rangeLowerTimestamp <= rangeUpperTimestamp) {
            String actualTableName = rangeShardingValue.getLogicTableName() + "_" + this.shardingSuffix(rangeLowerTimestamp);
            if(availableTargetNames.contains(actualTableName)) {
                actualTableNames.add(actualTableName);
            }
            rangeLowerTimestamp += this.getNextYearTimestamp(rangeLowerTimestamp);
        }
        return actualTableNames;
    }

    /**
     * 获取下一年的时间戳
     * 31622400000 闰年
     * 31536000000 平年
     * @param timestamp
     * @return
     */
    private Long getNextYearTimestamp(Long timestamp) {
        String curYear = formatThreadLocal.get().format(new Date(timestamp));
        boolean isLeap = Year.isLeap(Long.valueOf(curYear));
        if(isLeap) {
            return timestamp + 31622400000l;
        } else {
            return timestamp + 31536000000l;
        }
    }

    @Override
    public String getType() {
        return "CUSTOMER_TIMESTAMP_SPI";
    }

    /**
     * 初始化分片配置
     * @param properties 配置文件中配置项
     */
    @Override
    public void init(Properties properties) {
        this.props = properties;
        String autoCreateTableLowerTimestamp = properties.getProperty("auto-create-table-lower");
        try {
            this.tableLowerTimestamp = Long.valueOf(autoCreateTableLowerTimestamp);
        } catch (Exception e) {
            log.error("parse auto-create table lower date failed: {}, use default date 2020", e.getMessage());
            try {
                String defaultDate = "2020";
                this.tableLowerTimestamp = formatThreadLocal.get().parse(defaultDate).getTime();
            } catch (ParseException pe) {
                log.error("parse default date failed: {}", pe.getMessage());
            }
        }
    }
}
