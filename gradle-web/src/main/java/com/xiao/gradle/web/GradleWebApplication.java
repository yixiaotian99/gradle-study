package com.xiao.gradle.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 必须添加 @ComponentScan 否则依赖的项目找不到
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.xiao.gradle")
@MapperScan("com.xiao.gradle.dao.dao")
public class GradleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleWebApplication.class, args);
    }

}
