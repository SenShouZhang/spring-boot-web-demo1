package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 启动类
 *
 * @author zhang
 * @date 2022/05/02
 */
@SpringBootApplication
@EnableTransactionManagement
public class SpringBootWebDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebDemoApplication.class, args);
    }

}
