package com.springboot.exception.controller;

import com.springboot.exception.exception.MyException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lirt
 * 异常处理测试控制器
 */
@RestController
@CrossOrigin
public class ExceptionController {

    /**
     * 测试全局处理
     * @param id
     * @return
     */
    @RequestMapping("/{id}")
    public String test(@PathVariable Integer id){
        if(true){
            id = 1/id;
        }
        return "success";
    }

    @RequestMapping(value = "/")
    public String index() throws Exception{
        String name = "";
        if(StringUtils.isEmpty(name)){
            throw new MyException("1001","empty","/API/getUserName","在获取用户名字的时候为空");
        }
        return name;
    }
}
