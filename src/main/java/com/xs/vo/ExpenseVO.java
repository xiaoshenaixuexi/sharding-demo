package com.xs.vo;

import com.xs.enums.CurrencyUnitEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: ExpenseVO
 * Package: com.xs.vo
 * Description:
 *
 * @Author 高伟
 * @Create 2025/4/8 14:37
 * @Version 1.0
 */

@Data
public class ExpenseVO {

    /**
     * 主键自增
     */
    private Long id;

    /**
     * 类型 0 - 付款  1 - 收款
     */
    private Integer expenseType;

    /**
     * 单位 0 - RMB 1 - USD
     */
    private Integer unit;

    /**
     * 金额
     */
    private BigDecimal price;

    /**
     *
     */
    private Long createTime;


    private Long productId;

    private String productName;

    private String createTimeStr;

    private String priceStr;

    public String getPriceStr() {
        String unitStr = CurrencyUnitEnum.getNameById(unit);
        return price + unitStr;
    }

    public String getCreateTimeStr() {
        if (createTime == null) {
            return "";
        }
        Date date = new Date(createTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

}
