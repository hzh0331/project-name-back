package com.example.projectnameback.service;

import com.example.projectnameback.mapper.TestMapper;
import com.example.projectnameback.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestMapper testMapper;

    public Test getTest(String test){
        return testMapper.getTest(test);
    }
}
