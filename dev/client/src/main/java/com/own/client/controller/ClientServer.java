package com.own.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author：chenxuebing
 * @ Date：2019/11/26 11:53
 * @ Description：client端的服务
 */
@Controller
public class ClientServer {
    @RequestMapping("/sayhello")
    @ResponseBody
    public String sayHello(){
        return "我是来自client服务端，你好呀！";
    }
}
