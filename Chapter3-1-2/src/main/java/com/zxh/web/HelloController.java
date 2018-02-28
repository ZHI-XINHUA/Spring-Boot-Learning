package com.zxh.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xh.zhi on 2018-2-24.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello spring-boot";
    }

    @RequestMapping("/")
   public String index(ModelMap map){
        map.addAttribute("host","http://blog.didispace.com");
        map.addAttribute("info","大幅度辅导辅导费");
       return "index";
    }
}
