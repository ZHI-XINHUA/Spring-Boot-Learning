package com.zxh;


import com.zxh.domain.User;
import com.zxh.web.HelloController;
import com.zxh.web.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by xh.zhi on 2018-2-23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTests {

    private MockMvc mvc;

    @Before
    public void set(){
        mvc = MockMvcBuilders.standaloneSetup(new HelloController(),new UserController()).build();
    }

    @Test
    public void getHello() throws Exception{
        mvc.perform(get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("welcome to spring-boot!")));
    }

    @Test
    public void getUserList() throws Exception{
        RequestBuilder request = get("/users/");
        mvc.perform(request).andExpect(status().isOk()).andExpect(content().string(equalTo("[]")));
    }

    @Test
    public void addUser() throws  Exception{
        RequestBuilder request = MockMvcRequestBuilders.post("/users/")
                .param("id","1")
                .param("name","james")
                .param("age","33");

        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("success")));

        getUserList1();

        putUser();

        delUser();

        getUserList();
    }

    @Test
    public void getUserList1() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/users/");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"james\",\"age\":33}]")));
    }


    @Test
    public void putUser() throws  Exception{
        RequestBuilder request = MockMvcRequestBuilders.put("/users/1")
                .param("name","kobe")
                .param("age","39");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("success")));
    }

    @Test
    public void delUser() throws  Exception{
        RequestBuilder request = MockMvcRequestBuilders.delete("/users/1");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("success")));
    }


}
