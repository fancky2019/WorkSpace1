package com.fancky.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.fancky.*")
public class FanckyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanckyWebApplication.class, args);
    }

}