package com.springboot.helloworld.controller;

import com.springboot.helloworld.utils.MD5;
import org.springframework.web.bind.annotation.*;

/**
 * @author lirt
 */
@CrossOrigin
@RestController
@RequestMapping("md5")
public class Md5Controller {

    @GetMapping(value = "getMd5")
    public String getMd5(@RequestParam("str") String str){
        return MD5.translate(str);
    }
}
