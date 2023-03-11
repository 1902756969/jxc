package com.atguigu.jxc.entity;

import lombok.Data;
/**
 * 用户登录信息封装
 */
@Data
public class UserLogin {

    private String userName;
    private String password;
    private String imageCode;
}
