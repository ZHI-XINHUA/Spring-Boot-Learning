package com.zxh.springbootfastjson;

import com.zxh.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


/**
 * Created by zhixinhua on 18/3/10.
 */
@Controller
public class SimpleController {

    @GetMapping("getp")
    @ResponseBody
    public Object getPersion(){
        Person p = new Person();
        p.setName("zxh");
        p.setAge(34);
        p.setAddress("FFdd");
        p.setBirthday(new Date());
        return  p;
    }

    @GetMapping("test")
    @ResponseBody
    public String test(){
        return "dd";
    }
}
