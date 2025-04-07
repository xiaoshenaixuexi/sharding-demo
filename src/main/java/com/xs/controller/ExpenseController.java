package com.xs.controller;

import cn.hutool.json.JSONUtil;
import com.xs.mapper.ExpenseMapper;
import com.xs.model.Expense;
import org.springframework.web.bind.annotation.GetMapping;
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

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2026-04-02 10:03:00");
        expense.setCreateTime(date.getTime());
        expense.setModifyTime(date.getTime());
//        expense.setCreateTime(System.currentTimeMillis());
//        expense.setModifyTime(System.currentTimeMillis());
        // 调用ExpenseMapper的save方法保存Expense对象
        expenseMapper.insert(expense);
        return "success";
    }

    @GetMapping("/getExpenseList")
    public String getExpenseList() {
        // 调用ExpenseMapper的getExpenseList方法获取所有Expense对象
        return JSONUtil.toJsonStr(expenseMapper.getExpenseList());
    }

}
