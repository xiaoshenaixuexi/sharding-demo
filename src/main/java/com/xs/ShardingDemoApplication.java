package com.xs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * ClassName: ${NAME}
 * Package: com.xs
 * Description:
 *
 * @Author 高伟
 * @Create 2025/4/1 16:08
 * @Version 1.0
 */

@MapperScan("com.xs.mapper")
@SpringBootApplication
public class ShardingDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingDemoApplication.class, args);
    }
}