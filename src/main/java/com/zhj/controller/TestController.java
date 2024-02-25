package com.zhj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhj
 * @version 1.0
 * @description
 * @date 2024/2/25 22:53
 */
@RestController
public class TestController {


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
