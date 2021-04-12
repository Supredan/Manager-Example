package com.example.manager.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.manager.mapper")
public class MyBatisPlusConfig {
}
