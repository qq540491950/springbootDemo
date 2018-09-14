package com.springboot.data.controller;

import com.springboot.data.entity.Demo;
import com.springboot.data.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lirt
 */
@RestController
@CrossOrigin
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "save")
    public String save(){
        Demo demo = new Demo();
        demo.setId("1");
        demo.setName("李青");
        demoService.save(demo);
        return "success";
    }

    /**
     * http://127.0.0.1:8003/data/getDemo?id=1
     * @param id
     * @return
     */
    @RequestMapping(value = "getDemo")
    public Demo getDemo(String id){
        return demoService.getDemo(id);
    }
}
