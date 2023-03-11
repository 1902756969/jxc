package com.atguigu.jxc.entity;

import lombok.Data;
/**
 * 系统菜单
 */
@Data
public class Menu {

  private Integer menuId;
  private String menuIcon;
  private String menuName;
  private Integer pId;
  private Integer menuState;
  private String menuUrl;

}
