package com.zxk.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxk
 * @version 1.0
 * @description: TODO
 * @date 2021/3/18 9:08
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping("hello")
    public String Hello(){
        return "Hello World!";
    }

}
