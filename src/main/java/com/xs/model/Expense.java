package com.xs.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
* ClassName: Expense
* Package: com.xs.model
* Description:
* @Author 高伟
* @Create 2025/4/2 16:53
* @Version 1.0
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expense {

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
     * 商品ID
     */
    private Long productId;

    /**
     *
     */
    private Long createTime;

    /**
     *
     */
    private Long modifyTime;

}
