package com.clt.wechatordering.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单
 * @ Author   ：clt.
 * @ Date     ：Created in 16:20 2019/6/13
 */

@Data
public class OrderDetail {
    private String detatilId;
    private String orderId;
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productQuantity;
    private String productIcon;
    private Date createTime;
    private Date updateTime;
}
