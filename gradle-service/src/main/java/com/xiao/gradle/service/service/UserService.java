package com.xiao.gradle.service.service;

/**
 * @Author sunjinwei
 * @Date 2020-07-06 22:43
 * @Description 定义用户接口
 **/
public interface UserService {

    /**
     * 根据用户id查询用户
     *
     * @param id
     * @return
     */
    String getUserById(Long id);

}
