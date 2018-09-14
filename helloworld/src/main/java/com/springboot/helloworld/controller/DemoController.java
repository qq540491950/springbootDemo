package com.springboot.helloworld.controller;

import com.springboot.helloworld.entity.Demo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lirt
 */
@RestController
@RequestMapping(value = "demo")
@CrossOrigin
public class DemoController {

    @GetMapping(value = "getDemo")
    public Demo getDemo () {
        Demo demo = new Demo();
        demo.setId("007");
        demo.setName("凌凌漆");
        return demo;
    }
}
