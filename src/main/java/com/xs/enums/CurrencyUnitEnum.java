package com.xs.enums;

/**
 * ClassName: UnitEnum
 * Package: com.xs.enums
 * Description:
 *
 * @Author 高伟
 * @Create 2025/4/8 14:28
 * @Version 1.0
 */
public enum CurrencyUnitEnum {

    RMB(1,"CNY"),
    USD(2,"USD"),
    EUR(3,"EUR"),
    CAD(4,"CAD"),
    ;

    private Integer id;
    private String name;

    CurrencyUnitEnum(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static String getNameById(Integer id) {
        for (CurrencyUnitEnum currencyUnitEnum : CurrencyUnitEnum.values()) {
            if (currencyUnitEnum.getId().equals(id)) {
                return currencyUnitEnum.getName();
            }
        }
        return RMB.name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
