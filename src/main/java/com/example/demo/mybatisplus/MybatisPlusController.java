package com.example.demo.mybatisplus;

import cn.hutool.core.lang.Assert;
import cn.hutool.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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

    @GetMapping("/hello-transactional")
    @Transactional
    public String helloTransactional() {
        Region region = new Region();
        region.setRegionId(8L);
        region.setRegionName("东南");
        Assert.isTrue(regionMapper.insert(region) == 1, "插入失败");
        return "";
    }
}
