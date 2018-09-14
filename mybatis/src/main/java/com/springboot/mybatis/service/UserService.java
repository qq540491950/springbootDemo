package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.User;

import java.util.List;

/**
 * @author lirt
 */
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> selectUsers();
}
