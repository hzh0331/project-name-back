package com.example.projectnameback.controller;

import com.example.projectnameback.pojo.Test;
import com.example.projectnameback.service.TestService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @CrossOrigin
    @GetMapping("/test")
    public Test getTest(@Param("test") String test){
        System.out.println("aaaaaaaa");
        return testService.getTest(test);
    }
}
