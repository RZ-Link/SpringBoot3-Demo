package com.example.demo.mybatisplus;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("DMHR.REGION")
public class Region {
    private Long regionId;
    private String regionName;
}
