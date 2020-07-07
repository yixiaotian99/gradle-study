package com.xiao.gradle.service.service.impl;

import com.xiao.gradle.dao.entity.Users;
import com.xiao.gradle.dao.dao.UsersMapper;
import com.xiao.gradle.service.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(Users)表服务实现类
 *
 * @author sunjinwei
 * @since 2020-07-07 17:25:39
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {


    @Resource
    private UsersMapper usersMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Users queryById(Long id) {
        return this.usersMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Users> queryAllByLimit(int offset, int limit) {
        return this.usersMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    @Override
    public Users insert(Users users) {
        this.usersMapper.insert(users);
        return users;
    }

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    @Override
    public Users update(Users users) {
        this.usersMapper.update(users);
        return this.queryById(users.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.usersMapper.deleteById(id) > 0;
    }
}