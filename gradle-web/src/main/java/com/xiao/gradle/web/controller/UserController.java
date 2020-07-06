package com.xiao.gradle.web.controller;

import com.xiao.gradle.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sunjinwei
 * @Date 2020-07-06 22:45
 * @Description 用户操作
 **/
@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("getUserById")
    public String getUserById(Long id) {

        return userService.getUserById(id);

    }


}
