package com.parkingLot.parkingLot.controller;

import com.parkingLot.parkingLot.domin.ParkingBoy;
import com.parkingLot.parkingLot.domin.ParkingLot;
import com.parkingLot.parkingLot.service.ParkingBoyService;
import com.parkingLot.parkingLot.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class ParkingBoyController {
    @Autowired
    ParkingBoyService parkingBoyService;

    @PostMapping("/ParkingBoys")
    public Map<String ,Object> addParkingBoy(@RequestBody ParkingBoy request) {
        Map<String ,Object> response = new LinkedHashMap<>();
        ParkingBoy parkingBoy =  parkingBoyService.addParkingBoy(request);
        if(parkingBoy != null){
            response.put("status","add parkingBoy successfully");
            response.put("parkingBoy",parkingBoy);
        }else{
            response.put("status","fail");
        }
        return response;
    }
}
