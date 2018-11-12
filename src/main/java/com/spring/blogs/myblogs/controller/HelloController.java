package com.spring.blogs.myblogs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**
     * hello world控制器
     */
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
