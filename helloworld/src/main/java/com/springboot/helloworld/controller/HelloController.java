package com.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lirt
 */
@RestController
@CrossOrigin
@RequestMapping(value = "hello")
public class HelloController {

    @GetMapping(value = "index")
    public String index(){
        return "hello springboot";
    }
}
