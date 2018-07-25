package com.parkingLot.parkingLot.controller;

import com.parkingLot.parkingLot.domin.ParkingLot;
import com.parkingLot.parkingLot.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class ParkingLotController {
    @Autowired
    ParkingLotService parkingLotService;

    @PostMapping(path = "ParkingLots")
    public Map<String ,Object> addParkingLot(@RequestBody ParkingLot request) {
        Map<String ,Object> response = new LinkedHashMap<>();
        ParkingLot parkingLot =  parkingLotService.addParkingLot(request);
        if(parkingLot != null){
            response.put("status","add parkingLot successfully");
            response.put("parkingLot",parkingLot);
        }else{
            response.put("status","fail");
        }
        return response;
    }
}
