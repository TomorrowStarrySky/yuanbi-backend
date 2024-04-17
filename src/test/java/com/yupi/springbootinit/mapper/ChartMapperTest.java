package com.yupi.springbootinit.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChartMapperTest {
    @Resource
    private ChartMapper chartMapper;

    @Test
    void queryChartData() {
        String chartId = "1779115609941225473";
        String querySql = String.format("select * from chart_%s",chartId);
        List<Map<String,Object>> result = chartMapper.queryChartData(querySql);
        System.out.println(result);
    }
}