package com.zxh.springbootyml;

import com.zxh.springbootyml.server.HelloServer_2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhixinhua on 18/3/18.
 * Configuration指明当前类是一个配置类;就是来替代之前的Spring配置文件
 ￼
 */
@Configuration
public class MyConfig {

    @Bean
    public HelloServer_2 helloServer_2(){
        System.out.println("配置类@Bean给容器中添加组件了...");
        return new HelloServer_2();
    }
}
