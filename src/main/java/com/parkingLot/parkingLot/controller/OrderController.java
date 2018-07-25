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

//    @GetMapping("/Orders/{status}")
//    public Map<String ,Object> getCompanyById(@PathVariable long id){
//        Map<String ,Object> response = new LinkedHashMap<>();
//        Company company =  companyService.getCompanyById(id);
//        if(company != null){
//            response.put("status","successful");
//            response.put("employee",company);
//        }else{
//            response.put("status","fail");
//        }
//        return response;
//    }
}
