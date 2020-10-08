package com.example.projectnameback.mapper;

import com.example.projectnameback.pojo.Test;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper {
    Test getTest(@Param("test") String test);
}
