package com.zxh.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by xh.zhi on 2018-2-23.
 */
@Component
@ConfigurationProperties(prefix = "com.zxh.blog")
public class BlogProperties {

    //@Value("${com.zxh.blog.name}")
    private String name;
   // @Value("${com.zxh.blog.title}")
    private String title;
   // @Value("${com.zxh.blog.desc}")
    private String desc;

    //@Value("${com.zxh.blog.value}")
    private String value;
    //@Value("${com.zxh.blog.number}")
    private Integer number;
   // @Value("${com.zxh.blog.bignumber}")
    private Long bignumber;
  //  @Value("${com.zxh.blog.test1}")
    private Integer test1;
   // @Value("${com.zxh.blog.test2}")
    private Integer test2;
   // @Value("${com.zxh.blog.uuid}")
    private String uuid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBignumber() {
        return bignumber;
    }

    public void setBignumber(Long bignumber) {
        this.bignumber = bignumber;
    }

    public Integer getTest1() {
        return test1;
    }

    public void setTest1(Integer test1) {
        this.test1 = test1;
    }

    public Integer getTest2() {
        return test2;
    }

    public void setTest2(Integer test2) {
        this.test2 = test2;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
