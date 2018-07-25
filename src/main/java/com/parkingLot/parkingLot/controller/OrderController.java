package com.parkingLot.parkingLot.controller;

import com.parkingLot.parkingLot.domin.Order;
import com.parkingLot.parkingLot.service.OrderService;
import com.parkingLot.parkingLot.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/Orders")
    public List<Order> getAllOrder(){
        return orderService.getAllOrder();
    }
    
    @GetMapping("/Orders/{OrderStatus}")
    public List<Order> getOrderByStatus(@PathVariable boolean OrderStatus){
        return orderService.getOrderByStatus(OrderStatus);
    }
}
