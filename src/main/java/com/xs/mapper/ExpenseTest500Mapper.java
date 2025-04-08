package com.xs.mapper;


import com.xs.model.ExpenseTest500;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Administrator
* @description 针对表【t_expense_test_500】的数据库操作Mapper
* @createDate 2025-04-07 16:53:02
* @Entity com.xs.model.ExpenseTest500
*/
public interface ExpenseTest500Mapper {

    void batchSave(@Param("list") List<ExpenseTest500> list);
}




