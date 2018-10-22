package com.air.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.air.demo.dao.UserMapper;

@RestController
@EnableAutoConfiguration
public class TestController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUser/{id}")
    @ResponseBody
    String getUser(@PathVariable Long id) {
        return   userMapper.getById(id).toString();
    }
}	
