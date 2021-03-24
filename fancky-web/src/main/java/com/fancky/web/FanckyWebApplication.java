package com.fancky.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages = "com.fancky.*")
@MapperScan(basePackages = {"com.fancky.*"})
//类不在主目录下需要指定扫描类完全限定名
//@ComponentScan(basePackages = {"com.example.demo.service"})
public class FanckyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanckyWebApplication.class, args);
    }

}
