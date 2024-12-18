package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.demo.mybatisplus")
@SpringBootApplication
public class SpringBoot3DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3DemoApplication.class, args);
    }

}
