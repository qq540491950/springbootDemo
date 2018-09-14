package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.User;
import com.springboot.mybatis.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lirt
 */
@RestController
@CrossOrigin
@RequestMapping(value = "user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * http://127.0.0.01:8050/user/selectUsers
     * @return
     */
    @GetMapping("selectUsers")
    public List<User> selectUsers() {
        return userService.selectUsers();
    }
}
