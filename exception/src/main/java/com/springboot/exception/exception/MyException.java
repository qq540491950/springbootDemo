package com.springboot.exception.exception;

public class MyException extends RuntimeException{

    /** 异常状态码 **/
    private String code;
    /** 异常信息 **/
    private String message;
    /** 发生的方法，位置等 **/
    private String method;
    /** 描述 **/
    private String descinfo;

    public MyException(String code, String message, String method, String descinfo) {
        this.code=code;
        this.message=message;
        this.method=method;
        this.descinfo=descinfo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getDescinfo() {
        return descinfo;
    }

    public void setDescinfo(String descinfo) {
        this.descinfo = descinfo;
    }
}
