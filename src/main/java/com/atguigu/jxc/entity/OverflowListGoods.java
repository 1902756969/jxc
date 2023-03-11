package com.atguigu.jxc.entity;

import lombok.Data;
/**
 * 报溢商品信息
 */
@Data
public class OverflowListGoods {

  private Integer overflowListGoodsId;
  private Integer goodsId;
  private String goodsCode;
  private String goodsName;
  private String goodsModel;
  private String goodsUnit;
  private Integer goodsNum;
  private double price;
  private double total;
  private Integer overflowListId;
  private Integer goodsTypeId;

}
