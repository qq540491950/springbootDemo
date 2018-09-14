package com.springboot.mybatis.mapper;

import com.springboot.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lirt
 */
@Mapper
public interface UserMapper {

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> selectUsers();
}
