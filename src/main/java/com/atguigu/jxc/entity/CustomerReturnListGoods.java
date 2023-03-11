package com.atguigu.jxc.entity;

import lombok.Data;
/**
 * 客户退货商品
 */
@Data
public class CustomerReturnListGoods {

  private Integer customerReturnListGoodsId;
  private Integer goodsId;
  private String goodsCode;
  private String goodsName;
  private String goodsModel;
  private Integer goodsNum;
  private String goodsUnit;
  private double price;
  private double total;
  private Integer customerReturnListId;
  private Integer goodsTypeId;

}
