package com.atguigu.jxc.entity;

import lombok.Data;
/**
 * 供应商
 */
@Data
public class Supplier {

  private Integer supplierId;
  private String supplierName;
  private String contacts;
  private String phoneNumber;
  private String address;
  private String remarks;

}
