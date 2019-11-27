package com.own.servicesurport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author：chenxuebing
 * @ Date：2019/11/25 17:30
 * @ Description：服务提供者提供打招呼的服务
 */
@Controller
public class SayHello {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }
}
