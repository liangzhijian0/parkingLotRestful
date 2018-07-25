package com.parkingLot.parkingLot.service;

import com.parkingLot.parkingLot.DB;
import com.parkingLot.parkingLot.domin.Car;
import com.parkingLot.parkingLot.domin.ParkingLot;
import com.parkingLot.parkingLot.domin.Receipt;
import org.springframework.stereotype.Component;

@Component
public class ReceiptService {

    public  Receipt park(Car request) {
        return DB.park(request);
    }


    public Car unpark(int receiptsId) {
        return DB.unpark(receiptsId);
    }
}
