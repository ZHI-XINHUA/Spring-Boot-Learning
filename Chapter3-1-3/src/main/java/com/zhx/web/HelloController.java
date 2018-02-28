package com.zhx.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xh.zhi on 2018-2-24.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello spring boot1";
    }

    @RequestMapping("/")
    public String index(ModelMap map){
        map.addAttribute("host","这句话你你发达省份");
        return "index";
    }
}
