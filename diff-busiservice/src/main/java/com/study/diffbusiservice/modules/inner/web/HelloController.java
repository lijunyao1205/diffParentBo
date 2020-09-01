package com.study.diffbusiservice.modules.inner.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class); //日志对象

    @Value("${server.port}")
    private String port;

    @RequestMapping("/sayHi")
    public String sayHi(@RequestParam String name){
        logger.debug("sayHi~~~~~~~~:" + name);
        return "hi " + name + ", i am from port: " + port;
    }
    @RequestMapping("/sayHi2/{name}")
    public String sayHi2(@PathVariable String name){
        logger.debug("sayHi~~~~~~~~:" + name);
        return "hi " + name + ", i am from port: " + port;
    }
}
