package com.xs.service;

import com.xs.mapper.ExpenseMapper;
import com.xs.model.Expense;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * ClassName: ExpenseService
 * Package: com.xs.service
 * Description:
 *
 * @Author 高伟
 * @Create 2025/4/8 11:01
 * @Version 1.0
 */

@Service
public class ExpenseService {

    @Resource
    private ExpenseMapper expenseMapper;

    @Transactional
    public void saveExpense(Expense expense) {
        expenseMapper.insert(expense);
    }

}
