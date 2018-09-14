package com.springboot.helloworld.utils;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static String translate(String str){
        MessageDigest md5;
        String temp = "";
        try {
            md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base = new BASE64Encoder();
            temp = base.encode(md5.digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return temp;
    }
}
