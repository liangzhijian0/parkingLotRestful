package com.parkingLot.parkingLot.controller;

import com.parkingLot.parkingLot.domin.ParkingBoy;
import com.parkingLot.parkingLot.domin.ParkingLot;
import com.parkingLot.parkingLot.service.ParkingBoyService;
import com.parkingLot.parkingLot.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/ParkingBoys/{ParkingBoysId}/ParkingLots")
    public Map<String ,Object> manageParkingLotToParkingBoy(@PathVariable int ParkingBoysId,@RequestBody ParkingLot request) {
        Map<String ,Object> response = new LinkedHashMap<>();
        ParkingBoy parkingBoy =  parkingBoyService.manageParkingLotToParkingBoy(ParkingBoysId,request);
        if(parkingBoy != null){
            response.put("status","put parkingLots to parkingBoy successfully");
            response.put("parkingBoy",parkingBoy);
        }else{
            response.put("status","fail");
        }
        return response;
    }

    @DeleteMapping("/ParkingBoys/{id}")
    public Map<String ,Object> deleteParkingBoy(@PathVariable int id){
        Map<String ,Object> response = new LinkedHashMap<>();
        ParkingBoy parkingBoy =  parkingBoyService.deleteParkingBoy(id);
        if(parkingBoy != null){
            response.put("status","delete parkingBoy successfully");
            response.put("parkingBoy",parkingBoy);
        }else{
            response.put("status","fail");
        }
        return response;
    }
}
