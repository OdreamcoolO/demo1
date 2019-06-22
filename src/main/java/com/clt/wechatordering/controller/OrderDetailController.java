package com.clt.wechatordering.controller;

import com.clt.wechatordering.pojo.OrderDetail;
import com.clt.wechatordering.sevice.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ Author   ：clt.
 * @ Date     ：Created in 16:31 2019/6/13
 */
@RestController
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @RequestMapping("/order/list")
    public List<OrderDetail> findAllOrder(){
        return orderDetailService.findAllOrder();
    }

    @RequestMapping("/order/{id}")
    public OrderDetail findOrderById(@PathVariable Integer id){
        return  orderDetailService.findOrderById(id);
    }

}
