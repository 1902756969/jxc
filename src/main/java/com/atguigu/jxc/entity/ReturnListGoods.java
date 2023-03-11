package com.atguigu.jxc.entity;

import lombok.Data;
/**
 * 退货商品
 */
@Data
public class ReturnListGoods {

  private Integer returnListGoodsId;
  private Integer goodsId;
  private String goodsCode;
  private String goodsName;
  private String goodsModel;
  private String goodsUnit;
  private Integer goodsNum;
  private double price;
  private double total;
  private Integer returnListId;
  private Integer goodsTypeId;

}
