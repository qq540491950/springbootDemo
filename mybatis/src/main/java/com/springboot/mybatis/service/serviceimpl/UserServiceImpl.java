package com.springboot.mybatis.service.serviceimpl;

import com.springboot.mybatis.entity.User;
import com.springboot.mybatis.mapper.UserMapper;
import com.springboot.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lirt
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectUsers() {
        return userMapper.selectUsers();
    }
}
