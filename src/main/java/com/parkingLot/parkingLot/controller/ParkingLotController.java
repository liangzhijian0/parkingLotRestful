package com.parkingLot.parkingLot.controller;

import com.parkingLot.parkingLot.domin.ParkingLot;
import com.parkingLot.parkingLot.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class ParkingLotController {
    @Autowired
    ParkingLotService parkingLotService;

    @PostMapping("/ParkingLots")
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

    @DeleteMapping("/ParkingLots/{id}")
    public Map<String ,Object> deleteParkingLot(@PathVariable int id){
        Map<String ,Object> response = new LinkedHashMap<>();
        ParkingLot parkingLot =  parkingLotService.deleteParkingLot(id);
        if(parkingLot != null){
            response.put("status","delete parkingLot successfully");
            response.put("parkingLot",parkingLot);
        }else{
            response.put("status","fail");
        }
        return response;
    }
}
