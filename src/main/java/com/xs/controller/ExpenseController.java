package com.xs.controller;

import cn.hutool.json.JSONUtil;
import com.xs.mapper.ExpenseMapper;
import com.xs.model.Expense;
import com.xs.service.ExpenseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: ExpenseController
 * Package: com.xs.controller
 * Description:
 *
 * @Author 高伟
 * @Create 2025/4/2 10:03
 * @Version 1.0
 */

@RestController
public class ExpenseController {

    @Resource
    private ExpenseService expenseService;
    @Resource
    private ExpenseMapper expenseMapper;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/saveExpense")
    public String saveExpense() throws ParseException {
        // 创建一个Expense对象
        Expense expense = new Expense();
        expense.setExpenseType(1);
        expense.setUnit(1);
        expense.setPrice(new BigDecimal("100.00"));
        int productId = (int)((Math.random() * 3) + 1);
        expense.setProductId(Long.valueOf(productId));
        int year = (int)((Math.random() * 10) + 20);
        int month = (int)((Math.random() * 9) + 1);
        int day = (int)((Math.random() * 9) + 1);
        String timeStr = "20" + year + "-0" + month + "-0" + day + " 10:03:00";
//        String timeStr = "2030-01-01 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(timeStr);
        expense.setCreateTime(date.getTime());
        expense.setModifyTime(date.getTime());
        // 调用ExpenseMapper的save方法保存Expense对象
        expenseService.saveExpense(expense);
        return "success";
    }

    @GetMapping("/getExpenseList/{offset}/{pageSize}")
    public String getExpenseList(@PathVariable Integer offset, @PathVariable Integer pageSize) {
        // 调用ExpenseMapper的getExpenseList方法获取所有Expense对象
        return JSONUtil.toJsonStr(expenseMapper.selectExpenseList(offset, pageSize));
    }

    @GetMapping("/count")
    public Integer count() {
        return expenseMapper.selectCount();
    }

}
