package com.xs;

import com.xs.mapper.ExpenseTest3000Mapper;
import com.xs.mapper.ExpenseTest500Mapper;
import com.xs.model.ExpenseTest3000;
import com.xs.model.ExpenseTest500;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ShardingDemoApplicationTest
 * Package: com.xs
 * Description:
 *
 * @Author 高伟
 * @Create 2025/4/7 16:48
 * @Version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShardingDemoApplicationTest {

    @Resource
    private ExpenseTest500Mapper expenseTest500Mapper;
    @Resource
    private ExpenseTest3000Mapper expenseTest3000Mapper;

    /**
     * 批量插入 500W 数据测试
     */
    @Test
    public void testSaveExpense500() {
        int total = 500 * 10000;
        List<ExpenseTest500> list = new ArrayList<>();
        for(int i = 4690001; i <= total; i++) {
            ExpenseTest500 expenseTest500 = new ExpenseTest500();
            expenseTest500.setSubBillId(Long.valueOf(i / 1000 + 1));
            expenseTest500.setExpenseId(Long.valueOf(i / 1000 + 1));
            expenseTest500.setExpenseOrderTypeId(Long.valueOf(i / 1000 + 1));
            expenseTest500.setExpenseOrderId(Long.valueOf(i));
            expenseTest500.setChargeUnitId(Long.valueOf(i / 1000 + 1));
            expenseTest500.setDeductionMethodId(Long.valueOf(i / 1000 + 1));
            expenseTest500.setCurrencyId(Long.valueOf(i / 1000 + 1));
            expenseTest500.setProductVersionId(Long.valueOf(i / 1000 + 1));
            expenseTest500.setUnitId(Long.valueOf(i / 1000 + 1));
            expenseTest500.setUnitPrice(new BigDecimal(1.00));
            expenseTest500.setAmount(new BigDecimal(1.00));
            expenseTest500.setNumber(new BigDecimal(1.00));
            expenseTest500.setZoneDetailId(Long.valueOf(i / 1000 + 1));
            expenseTest500.setNotes("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
            expenseTest500.setOmsSkuId(Long.valueOf(i / 1000 + 1));
            expenseTest500.setWeightingValue(new BigDecimal(100.00));
            expenseTest500.setIsDel(0);
            expenseTest500.setCreatorId(Long.valueOf(i / 1000 + 1));
            expenseTest500.setCreateTime((int)(System.currentTimeMillis() / 1000));
            expenseTest500.setModifierId(Long.valueOf(i / 1000 + 1));
            expenseTest500.setModifyTime((int)(System.currentTimeMillis() / 1000));
            expenseTest500.setWhetherCalculation(1);
            list.add(expenseTest500);
            if(i % 1000 == 0) {
                expenseTest500Mapper.batchSave(list);
                list.clear();
            }
        }
    }

    /**
     * 批量插入 3000W 数据测试
     */
    @Test
    public void testSaveExpense3000() {
        int total = 500 * 10000 * 6;
        List<ExpenseTest3000> list = new ArrayList<>();
        for(int i = 1; i <= total; i++) {
            ExpenseTest3000 expenseTest3000 = new ExpenseTest3000();
            expenseTest3000.setSubBillId(Long.valueOf(i / 1000 + 1));
            expenseTest3000.setExpenseId(Long.valueOf(i / 1000 + 1));
            expenseTest3000.setExpenseOrderTypeId(Long.valueOf(i / 1000 + 1));
            expenseTest3000.setExpenseOrderId(Long.valueOf(i));
            expenseTest3000.setChargeUnitId(Long.valueOf(i / 1000 + 1));
            expenseTest3000.setDeductionMethodId(Long.valueOf(i / 1000 + 1));
            expenseTest3000.setCurrencyId(Long.valueOf(i / 1000 + 1));
            expenseTest3000.setProductVersionId(Long.valueOf(i / 1000 + 1));
            expenseTest3000.setUnitId(Long.valueOf(i / 1000 + 1));
            expenseTest3000.setUnitPrice(new BigDecimal(1.00));
            expenseTest3000.setAmount(new BigDecimal(1.00));
            expenseTest3000.setNumber(new BigDecimal(1.00));
            expenseTest3000.setZoneDetailId(Long.valueOf(i / 1000 + 1));
            expenseTest3000.setNotes("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
            expenseTest3000.setOmsSkuId(Long.valueOf(i / 1000 + 1));
            expenseTest3000.setWeightingValue(new BigDecimal(100.00));
            expenseTest3000.setIsDel(0);
            expenseTest3000.setCreatorId(Long.valueOf(i / 1000 + 1));
            expenseTest3000.setCreateTime((int)(System.currentTimeMillis() / 1000));
            expenseTest3000.setModifierId(Long.valueOf(i / 1000 + 1));
            expenseTest3000.setModifyTime((int)(System.currentTimeMillis() / 1000));
            expenseTest3000.setWhetherCalculation(1);
            list.add(expenseTest3000);
            if(i % 5000 == 0) {
                expenseTest3000Mapper.batchSave(list);
                list.clear();
            }
        }
    }

}
