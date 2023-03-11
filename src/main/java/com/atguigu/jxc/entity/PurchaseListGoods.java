package com.atguigu.jxc.entity;

import lombok.Data;
/**
 * 进货商品
 */
@Data
public class PurchaseListGoods {

  private Integer purchaseListGoodsId;
  private Integer goodsId;
  private String goodsCode;
  private String goodsName;
  private String goodsModel;
  private String goodsUnit;
  private Integer goodsNum;
  private double price;
  private double total;
  private Integer purchaseListId;
  private Integer goodsTypeId;

}
