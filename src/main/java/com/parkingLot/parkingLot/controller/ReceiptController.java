package com.parkingLot.parkingLot.controller;

import com.parkingLot.parkingLot.domin.Car;
import com.parkingLot.parkingLot.domin.ParkingLot;
import com.parkingLot.parkingLot.domin.Receipt;
import com.parkingLot.parkingLot.service.ParkingLotService;
import com.parkingLot.parkingLot.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class ReceiptController {
    @Autowired
    ReceiptService receiptService;

    @PostMapping("/Receipts")
    public Map<String ,Object> park(@RequestBody Car request) {
        Map<String ,Object> response = new LinkedHashMap<>();
        Receipt receipt =  receiptService.park(request);
        if(receipt != null){
            response.put("status","park cart successfully");
            response.put("receipt",receipt);
        }else{
            response.put("status","fail");
        }
        return response;
    }

    @PutMapping("/Receipts/{ReceiptsId}")
    public Map<String ,Object> unpark(@PathVariable int ReceiptsId) {
        Map<String ,Object> response = new LinkedHashMap<>();
        Car car =  receiptService.unpark(ReceiptsId);
        if(car != null){
            response.put("status","unpark cart successfully");
            response.put("car",car);
        }else{
            response.put("status","fail");
        }
        return response;
    }
}
