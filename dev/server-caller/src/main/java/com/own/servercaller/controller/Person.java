package com.own.servercaller.controller;

import com.own.servercaller.feignclient.SayHelloCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author：chenxuebing
 * @ Date：2019/11/26 9:30
 * @ Description：打招呼的一个对象
 */

@Controller
public class Person {

    @Autowired
    private SayHelloCaller caller;
    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return caller.sayHello();
    }
}
