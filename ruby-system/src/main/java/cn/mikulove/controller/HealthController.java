package cn.mikulove.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Name:HealthController
 * @Description:
 * @Author: Neil
 * @Date: 2020-08-23 23:10
 **/
@RestController("/system")
public class HealthController {

    @GetMapping("/healthz")
    public String healthz(){
        return "ok";
    }
}
