package com.intellijtestproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntellijTestProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntellijTestProjectApplication.class, args);
        System.out.println("dev branch");
    }

}
