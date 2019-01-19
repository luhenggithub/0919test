package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luheng
 * @create 2019/1/19
 */
@RestController
public class demoController {
    @RequestMapping("/test")
    public String get(){
        return "111111111111111";
    }
}
