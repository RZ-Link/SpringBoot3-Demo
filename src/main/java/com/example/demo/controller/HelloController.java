package com.example.demo.controller;

import com.example.demo.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public R hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return R.ok().setData(String.format("Hello %s!", name));
    }
}
