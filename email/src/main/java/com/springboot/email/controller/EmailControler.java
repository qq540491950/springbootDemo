package com.springboot.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

/**
 * @author lirt
 */
@RestController
@CrossOrigin
@RequestMapping(value = "email")
public class EmailControler {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String sender;

    @GetMapping(value = "sendText")
    public String sendText(@RequestParam(value = "content")String content){

        SimpleMailMessage message = new SimpleMailMessage();
        String msg;
        try {
            message.setFrom(sender);
            //自己给自己发送邮件
            message.setTo(sender);
            message.setSubject("主题：简单邮件");
            message.setText(content);
            mailSender.send(message);
            msg = "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            msg =  "系统异常";
        }
        return msg;
    }
}
