package com.own.servercaller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author：chenxuebing
 * @ Date：2019/11/26 13:35
 * @ Description：调用者服务端
 */
@Controller
public class CallerServer {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "我是来自caller的服务端，你好呀！";
    }
}
