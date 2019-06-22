package com.clt.wechatordering.sevice.impl;

import com.clt.wechatordering.mapper.OrderDetailMapper;
import com.clt.wechatordering.pojo.OrderDetail;
import com.clt.wechatordering.sevice.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author   ：clt.
 * @ Date     ：Created in 16:34 2019/6/13
 */
@Service("OrderDetailService")
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public List<OrderDetail> findAllOrder() {
        return orderDetailMapper.findAllOrder();
    }

    @Override
    public OrderDetail findOrderById(Integer id) {
        return orderDetailMapper.findOrderById(id);
    }
}
