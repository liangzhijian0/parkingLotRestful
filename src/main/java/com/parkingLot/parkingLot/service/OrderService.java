package com.parkingLot.parkingLot.service;

import com.parkingLot.parkingLot.DB;
import com.parkingLot.parkingLot.domin.Car;
import com.parkingLot.parkingLot.domin.Order;
import com.parkingLot.parkingLot.domin.Receipt;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {

    public List<Order> getAllOrder() {
        return DB.getAllOrder();
    }
}
