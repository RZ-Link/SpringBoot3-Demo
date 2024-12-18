package com.example.demo.mybatisplus;

import cn.hutool.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisPlusController {
    @Autowired
    private RegionMapper regionMapper;

    @GetMapping("/hello-mybatis-plus")
    public String helloMybatisPlus() {
        List<Region> regionList = regionMapper.selectList(null);
        return JSONUtil.toJsonStr(regionList);
    }
}
