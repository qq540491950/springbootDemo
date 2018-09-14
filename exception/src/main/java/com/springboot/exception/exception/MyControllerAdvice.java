package com.springboot.exception.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lirt
 * 全局异常捕捉和自定义异常捕捉
 */
@ControllerAdvice
public class MyControllerAdvice {

    /**
     * 全局异常处理
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map<String, Object> exceptionHandler (Exception e) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("code", "1");
        map.put("msg", e.getMessage());
        return map;
    }

    /**
     * 拦截捕捉自定义异常 MyException.class
     * @param myex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public Map<String,Object> myExceptionHandler(MyException myex){
        Map<String,Object> map  = new HashMap<>(16);
        map.put("code",myex.getCode());
        map.put("message",myex.getMessage());
        map.put("method",myex.getMethod());
        map.put("descinfo",myex.getDescinfo());
        //发生异常进行日志记录，写入数据库或者其他处理，此处省略
        return map;
    }
}
