package com.zxh.springbootjsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zhixinhua on 18/3/11.
 */
@Controller
public class IndexController {

    @GetMapping("index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("name","olay");
        return "index";
    }
}
