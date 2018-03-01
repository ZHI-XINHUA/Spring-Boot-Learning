package com.zxh.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by xh.zhi on 2018-2-24.
 */
@ApiModel(value = "user对象",description = "用户信息实体类")
public class User {

    @ApiModelProperty(value = "用户id",required = true,example = "唯一标识")
    private Long id;
    @ApiModelProperty(value = "用户名称",required = true,example = "张三")
    private String name;
    @ApiModelProperty(value = "年龄",example = "介于1~150")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
