package com.zxh.web;

import com.zxh.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by xh.zhi on 2018-2-23.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    static Map<Integer,User> users = new ConcurrentHashMap<Integer,User>();

    /*static {
        //模拟数据
        for (int i=1;i<=5;i++){
            User user = new User();
            user.setId(i);
            user.setName("name_"+i);
            user.setAge(i*5);
            users.put(i,user);
        }
    }*/

    //@GetMapping
   // @RequestMapping(value = "/",method = RequestMethod.GET)
    @GetMapping(value = "/")
    public List<User> getUserList() {
        // 处理"/users/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }

   // @RequestMapping(value = "/",method = RequestMethod.POST)
    @PostMapping("/")
    public String postUser(@ModelAttribute User user){
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        System.out.println("接受到user："+user.getId()+"="+user.getName());
        users.put(user.getId(),user);
        return "success";
    }

    //@RequestMapping(value="/{id}",method = RequestMethod.PUT)
    @PutMapping(value = "/{id}")
    public String putUser(@PathVariable Integer id,@ModelAttribute User user){
        User u = users.get(id);
        if(u==null) {
            return "error";
        }
        u.setName(user.getName());
        u.setAge(user.getAge());
        System.out.println(u.toString());
        return "success";
    }

    //@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delUser(@PathVariable Integer id){
        users.remove(id);
        return "success";
    }
}
