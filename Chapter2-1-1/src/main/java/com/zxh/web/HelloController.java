package com.zxh.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xh.zhi on 2018-2-23.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello spring-boot";
    }
}
