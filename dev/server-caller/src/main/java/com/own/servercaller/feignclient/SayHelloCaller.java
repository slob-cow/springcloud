package com.own.servercaller.feignclient;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author：chenxuebing
 * @ Date：2019/11/26 9:10
 * @ Description：调用service-provider的SayHello类的方法
 */

/**
 * 调用者的接口方法是被调用者方法的声明，映射路径与被调用者方法的映射路径相同
 */
@FeignClient(value = "server-provider") //调用的服务名称
public interface SayHelloCaller {
    @RequestMapping("/hello")
    public String sayHello();
}
