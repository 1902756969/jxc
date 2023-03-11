package com.atguigu.jxc.entity;

import lombok.Data;
/**
 * 销售商品
 */
@Data
public class SaleListGoods {

  private Integer saleListGoodsId;
  private Integer goodsId;
  private String goodsCode;
  private String goodsName;
  private String goodsModel;
  private Integer goodsNum;
  private String goodsUnit;
  private double price;
  private double total;
  private Integer saleListId;
  private Integer goodsTypeId;

}
