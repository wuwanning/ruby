package cn.mikulove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Name:HelloController
 * @Description:
 * @Author: Neil
 * @Date: 2020-06-06 19:18
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping("/test")
    public String helloWorld(){
           return "ok";
    }
}
