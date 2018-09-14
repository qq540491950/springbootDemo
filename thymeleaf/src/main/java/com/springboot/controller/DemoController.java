package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author lirt
 */
@Controller
public class DemoController {

    @RequestMapping("hello")
    public String hello(Map<String, Object> map){
        map.put("hello", "hello world!");
        return "hello";
    }
}
