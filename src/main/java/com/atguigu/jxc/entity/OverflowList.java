package com.atguigu.jxc.entity;

import lombok.Data;
/**
 * 报溢
 */
@Data
public class OverflowList {

  private Integer overflowListId;
  private String overflowNumber;
  private String overflowDate;
  private String remarks;
  private Integer userId;

  private String trueName;

}
