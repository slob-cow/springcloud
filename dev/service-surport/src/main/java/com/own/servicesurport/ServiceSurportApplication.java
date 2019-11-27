package com.own.servicesurport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //允许注册到注册中心
@SpringBootApplication
public class ServiceSurportApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSurportApplication.class, args);
    }

}
