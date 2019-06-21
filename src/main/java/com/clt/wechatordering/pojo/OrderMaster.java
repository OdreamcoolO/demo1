package com.clt.wechatordering.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单管理
 * @ Author   ：clt.
 * @ Date     ：Created in 16:24 2019/6/13
 */
@Data
public class OrderMaster {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus;
    private Integer payStatus;
    private Date createTime;
    private Date updateTime;
}
