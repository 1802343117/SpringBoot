package com.soft1851.boot.aop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController1 {

    @RequestMapping
    public String hello(String name){
        return "Hello " + name;
    }
}
