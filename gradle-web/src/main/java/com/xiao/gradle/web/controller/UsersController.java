package com.xiao.gradle.web.controller;

import com.xiao.gradle.dao.entity.Users;
import com.xiao.gradle.service.service.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户表(Users)表控制层
 *
 * @author sunjinwei
 * @since 2020-07-07 17:25:39
 */
@RestController
@RequestMapping("users")
public class UsersController {
    /**
     * 服务对象
     */
    @Resource
    private UsersService usersService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Users selectOne(Long id) {
        return this.usersService.queryById(id);
    }

}