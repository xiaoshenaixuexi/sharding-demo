package com.xs.mapper;


import com.xs.model.ExpenseTest3000;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Administrator
* @description 针对表【t_expense_test_3000】的数据库操作Mapper
* @createDate 2025-04-07 16:53:11
* @Entity com.xs.model.ExpenseTest3000
*/
public interface ExpenseTest3000Mapper {

    void batchSave(@Param("list") List<ExpenseTest3000> list);
}




