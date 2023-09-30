package cn.edu.ctbu.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/hello")
    public String sayhi(){

        return "你好，这是第一个springboot程序~！";
    }
}
