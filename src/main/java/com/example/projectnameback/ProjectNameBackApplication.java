package com.example.projectnameback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.projectnameback.mapper")
@SpringBootApplication
public class ProjectNameBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectNameBackApplication.class, args);
    }

}
