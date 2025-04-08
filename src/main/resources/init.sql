CREATE DATABASE wms_dev;
USE wms_dev;

DROP TABLE `t_expense_0`;
DROP TABLE `t_expense_1`;
DROP TABLE `t_expense_2`;
DROP TABLE `t_expense_3`;
DROP TABLE `t_expense_4`;
DROP TABLE `t_expense_5`;
DROP TABLE `t_expense_6`;
DROP TABLE `t_expense_7`;
DROP TABLE `t_expense_8`;
DROP TABLE `t_expense_9`;
DROP TABLE `t_expense_10`;
DROP TABLE `t_product`;


CREATE TABLE `t_expense_0` (
                               `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键自增',
                               `expense_type` INT NOT NULL DEFAULT 0 COMMENT '类型 0 - 付款  1 - 收款',
                               `unit` INT NOT NULL DEFAULT 0 COMMENT '单位 0 - RMB 1 - USD',
                               `price` DECIMAL(10,2) NOT NULL DEFAULT 0.00 COMMENT '金额',
                               `product_id` BIGINT(20) NOT NULL DEFAULT 0 comment '产品id',
                               `create_time`         BIGINT,
                               `modify_time`         BIGINT,
                               PRIMARY KEY (`id`)
) ENGINE = INNODB CHARSET = utf8;

CREATE TABLE `t_expense_1` (
                               `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键自增',
                               `expense_type` INT NOT NULL DEFAULT 0 COMMENT '类型 0 - 付款  1 - 收款',
                               `unit` INT NOT NULL DEFAULT 0 COMMENT '单位 0 - RMB 1 - USD',
                               `price` DECIMAL(10,2) NOT NULL DEFAULT 0.00 COMMENT '金额',
                               `product_id` BIGINT(20) NOT NULL DEFAULT 0 comment '产品id',
                               `create_time`         BIGINT,
                               `modify_time`         BIGINT,
                               PRIMARY KEY (`id`)
) ENGINE = INNODB CHARSET = utf8;

CREATE TABLE `t_expense_2` (
                               `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键自增',
                               `expense_type` INT NOT NULL DEFAULT 0 COMMENT '类型 0 - 付款  1 - 收款',
                               `unit` INT NOT NULL DEFAULT 0 COMMENT '单位 0 - RMB 1 - USD',
                               `price` DECIMAL(10,2) NOT NULL DEFAULT 0.00 COMMENT '金额',
                               `product_id` BIGINT(20) NOT NULL DEFAULT 0 comment '产品id',
                               `create_time`         BIGINT,
                               `modify_time`         BIGINT,
                               PRIMARY KEY (`id`)
) ENGINE = INNODB CHARSET = utf8;

CREATE TABLE `t_expense_3` (
                               `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键自增',
                               `expense_type` INT NOT NULL DEFAULT 0 COMMENT '类型 0 - 付款  1 - 收款',
                               `unit` INT NOT NULL DEFAULT 0 COMMENT '单位 0 - RMB 1 - USD',
                               `price` DECIMAL(10,2) NOT NULL DEFAULT 0.00 COMMENT '金额',
                               `product_id` BIGINT(20) NOT NULL DEFAULT 0 comment '产品id',
                               `create_time`         BIGINT,
                               `modify_time`         BIGINT,
                               PRIMARY KEY (`id`)
) ENGINE = INNODB CHARSET = utf8;


CREATE TABLE `t_expense_4` (
                               `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键自增',
                               `expense_type` INT NOT NULL DEFAULT 0 COMMENT '类型 0 - 付款  1 - 收款',
                               `unit` INT NOT NULL DEFAULT 0 COMMENT '单位 0 - RMB 1 - USD',
                               `price` DECIMAL(10,2) NOT NULL DEFAULT 0.00 COMMENT '金额',
                               `product_id` BIGINT(20) NOT NULL DEFAULT 0 comment '产品id',
                               `create_time`         BIGINT,
                               `modify_time`         BIGINT,
                               PRIMARY KEY (`id`)
) ENGINE = INNODB CHARSET = utf8;

CREATE TABLE `t_expense_5` (
                               `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键自增',
                               `expense_type` INT NOT NULL DEFAULT 0 COMMENT '类型 0 - 付款  1 - 收款',
                               `unit` INT NOT NULL DEFAULT 0 COMMENT '单位 0 - RMB 1 - USD',
                               `price` DECIMAL(10,2) NOT NULL DEFAULT 0.00 COMMENT '金额',
                               `product_id` BIGINT(20) NOT NULL DEFAULT 0 comment '产品id',
                               `create_time`         BIGINT,
                               `modify_time`         BIGINT,
                               PRIMARY KEY (`id`)
) ENGINE = INNODB CHARSET = utf8;

CREATE TABLE `t_expense_6` (
                               `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键自增',
                               `expense_type` INT NOT NULL DEFAULT 0 COMMENT '类型 0 - 付款  1 - 收款',
                               `unit` INT NOT NULL DEFAULT 0 COMMENT '单位 0 - RMB 1 - USD',
                               `price` DECIMAL(10,2) NOT NULL DEFAULT 0.00 COMMENT '金额',
                               `product_id` BIGINT(20) NOT NULL DEFAULT 0 comment '产品id',
                               `create_time`         BIGINT,
                               `modify_time`         BIGINT,
                               PRIMARY KEY (`id`)
) ENGINE = INNODB CHARSET = utf8;

CREATE TABLE `t_expense_7` (
                               `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键自增',
                               `expense_type` INT NOT NULL DEFAULT 0 COMMENT '类型 0 - 付款  1 - 收款',
                               `unit` INT NOT NULL DEFAULT 0 COMMENT '单位 0 - RMB 1 - USD',
                               `price` DECIMAL(10,2) NOT NULL DEFAULT 0.00 COMMENT '金额',
                               `product_id` BIGINT(20) NOT NULL DEFAULT 0 comment '产品id',
                               `create_time`         BIGINT,
                               `modify_time`         BIGINT,
                               PRIMARY KEY (`id`)
) ENGINE = INNODB CHARSET = utf8;

CREATE TABLE `t_expense_8` (
                               `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键自增',
                               `expense_type` INT NOT NULL DEFAULT 0 COMMENT '类型 0 - 付款  1 - 收款',
                               `unit` INT NOT NULL DEFAULT 0 COMMENT '单位 0 - RMB 1 - USD',
                               `price` DECIMAL(10,2) NOT NULL DEFAULT 0.00 COMMENT '金额',
                               `product_id` BIGINT(20) NOT NULL DEFAULT 0 comment '产品id',
                               `create_time`         BIGINT,
                               `modify_time`         BIGINT,
                               PRIMARY KEY (`id`)
) ENGINE = INNODB CHARSET = utf8;

CREATE TABLE `t_expense_9` (
                               `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键自增',
                               `expense_type` INT NOT NULL DEFAULT 0 COMMENT '类型 0 - 付款  1 - 收款',
                               `unit` INT NOT NULL DEFAULT 0 COMMENT '单位 0 - RMB 1 - USD',
                               `price` DECIMAL(10,2) NOT NULL DEFAULT 0.00 COMMENT '金额',
                               `product_id` BIGINT(20) NOT NULL DEFAULT 0 comment '产品id',
                               `create_time`         BIGINT,
                               `modify_time`         BIGINT,
                               PRIMARY KEY (`id`)
) ENGINE = INNODB CHARSET = utf8;

CREATE TABLE `t_expense_10` (
                               `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键自增',
                               `expense_type` INT NOT NULL DEFAULT 0 COMMENT '类型 0 - 付款  1 - 收款',
                               `unit` INT NOT NULL DEFAULT 0 COMMENT '单位 0 - RMB 1 - USD',
                               `price` DECIMAL(10,2) NOT NULL DEFAULT 0.00 COMMENT '金额',
                               `product_id` BIGINT(20) NOT NULL DEFAULT 0 comment '产品id',
                               `create_time`         BIGINT,
                               `modify_time`         BIGINT,
                               PRIMARY KEY (`id`)
) ENGINE = INNODB CHARSET = utf8;



### 测试数据量大后性能差异
CREATE TABLE `t_expense_test_500` (
                                       `id` BIGINT (20) NOT NULL AUTO_INCREMENT,
                                       `sub_bill_id` BIGINT (20),
                                       `expense_id` BIGINT (20),
                                       `expense_order_type_id` BIGINT (20),
                                       `expense_order_id` BIGINT (20),
                                       `charge_unit_id` BIGINT (20),
                                       `deduction_method_id` BIGINT (20),
                                       `currency_id` BIGINT (20),
                                       `product_version_id` BIGINT (20),
                                       `unit_id` BIGINT (20),
                                       `unit_price` DECIMAL (10, 2),
                                       `amount` DECIMAL (10, 2),
                                       `number` DECIMAL (10, 2),
                                       `zone_detail_id` BIGINT (20),
                                       `notes` VARCHAR (200),
                                       `oms_sku_id` BIGINT (20),
                                       `weighting_value` DECIMAL (12, 4),
                                       `is_del` TINYINT (1),
                                       `creator_id` BIGINT (20),
                                       `create_time` INT (11),
                                       `modifier_id` BIGINT (20),
                                       `modify_time` INT (11),
                                       `whether_calculation` TINYINT (1),
                                       PRIMARY KEY (`id`)
) ENGINE = INNODB CHARSET = utf8;


CREATE TABLE `t_expense_test_3000` (
                                      `id` BIGINT (20) NOT NULL AUTO_INCREMENT,
                                      `sub_bill_id` BIGINT (20),
                                      `expense_id` BIGINT (20),
                                      `expense_order_type_id` BIGINT (20),
                                      `expense_order_id` BIGINT (20),
                                      `charge_unit_id` BIGINT (20),
                                      `deduction_method_id` BIGINT (20),
                                      `currency_id` BIGINT (20),
                                      `product_version_id` BIGINT (20),
                                      `unit_id` BIGINT (20),
                                      `unit_price` DECIMAL (10, 2),
                                      `amount` DECIMAL (10, 2),
                                      `number` DECIMAL (10, 2),
                                      `zone_detail_id` BIGINT (20),
                                      `notes` VARCHAR (200),
                                      `oms_sku_id` BIGINT (20),
                                      `weighting_value` DECIMAL (12, 4),
                                      `is_del` TINYINT (1),
                                      `creator_id` BIGINT (20),
                                      `create_time` INT (11),
                                      `modifier_id` BIGINT (20),
                                      `modify_time` INT (11),
                                      `whether_calculation` TINYINT (1),
                                      PRIMARY KEY (`id`)
) ENGINE = INNODB CHARSET = utf8;


## 测试分表后联表查询
CREATE TABLE `t_product` (
                             `id` bigint (20) NOT NULL AUTO_INCREMENT,
                             `name` varchar (768),
                             `oms_sku` varchar (768),
                             `length` Decimal (12),
                             `width` Decimal (12),
                             `height` Decimal (12),
                             `weight` Decimal (12),
                             `unit` int (11),
                             `deleted` tinyint (1),
                             `create_time` int (11),
                             `modify_time` int (11)
) ENGINE = INNODB CHARSET = utf8;
