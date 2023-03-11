package com.atguigu.jxc.entity;

import lombok.Data;
/**
 * 报损商品
 */
@Data
public class DamageListGoods {

  private Integer damageListGoodsId;
  private Integer goodsId;
  private String goodsCode;
  private String goodsName;
  private String goodsModel;
  private String goodsUnit;
  private Integer goodsNum;
  private double price;
  private double total;
  private Integer damageListId;
  private Integer goodsTypeId;

}
