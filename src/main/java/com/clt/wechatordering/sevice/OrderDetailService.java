package com.clt.wechatordering.sevice;

import com.clt.wechatordering.pojo.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetail> findAllOrder();

    OrderDetail findOrderById(Integer id);
}
