package com.xs.mapper;

import com.xs.model.Expense;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Administrator
* @description 针对表【t_expense_202501】的数据库操作Mapper
* @createDate 2025-04-02 14:13:33
* @Entity com.xs.model.Expense
*/

@Mapper
public interface ExpenseMapper {

    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("INSERT INTO t_expense (`expense_type`, `unit`, `price`, `create_time`, `modify_time`) VALUES (#{expense.expenseType},#{expense.unit},#{expense.price},#{expense.createTime},#{expense.modifyTime})")
    int insert(@Param("expense") Expense expense);

    List<Expense> getExpenseList();

}




