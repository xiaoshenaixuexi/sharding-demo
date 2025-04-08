package com.xs.enums;

/**
 * ClassName: ExpenseTypeEnum
 * Package: com.xs.enums
 * Description:
 *
 * @Author 高伟
 * @Create 2025/4/8 14:28
 * @Version 1.0
 */
public enum ExpenseTypeEnum {

    PAY(1L,"支出"),
    INCOME(2L,"收入")
    ;

    private Long id;
    private String name;

    ExpenseTypeEnum(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
