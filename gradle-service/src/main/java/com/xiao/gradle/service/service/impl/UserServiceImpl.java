package com.xiao.gradle.service.service.impl;

import com.xiao.gradle.service.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author sunjinwei
 * @Date 2020-07-06 22:44
 * @Description 用户服务
 **/
@Service
public class UserServiceImpl implements UserService {


    @Override
    public String getUserById(Long id) {
        return "userService get user";
    }
}
