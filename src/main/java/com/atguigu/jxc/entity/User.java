package com.atguigu.jxc.entity;

import lombok.Data;
/**
 * 用户实体
 */
@Data
public class User {

  private Integer userId;
  private String userName;
  private String password;
  private String trueName;
  private String roles;
  private String remarks;

}
