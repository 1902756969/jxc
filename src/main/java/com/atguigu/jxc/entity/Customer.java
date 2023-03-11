package com.atguigu.jxc.entity;

import lombok.Data;

/**
 * 客户实体
 */
@Data
public class Customer {

  private Integer customerId;
  private String customerName;
  private String contacts;
  private String phoneNumber;
  private String address;
  private String remarks;

}
