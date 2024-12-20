package com.example.demo.mybatisplus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RegionDao {

    @Autowired
    private RegionMapper regionMapper;

    public List<Region> selectList() {
        return regionMapper.selectList(null);
    }

    public int insert(Region region) {
        return regionMapper.insert(region);
    }
}
