package com.example.twodatasource.controller;

import com.example.twodatasource.entity.User;
import com.example.twodatasource.test.mapper.UserMapper;
import com.example.twodatasource.test1.mapper.UserMapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserMapper1 userMapper1;

    @GetMapping("/test/user")
    public User getUser() {
        return userMapper.selectTop1();
    }

    @GetMapping("/test1/user")
    public User getUser1() {
        return userMapper1.selectTop1();
    }
}
