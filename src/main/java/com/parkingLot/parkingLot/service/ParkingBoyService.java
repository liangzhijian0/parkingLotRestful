package com.parkingLot.parkingLot.service;

import com.parkingLot.parkingLot.domin.ParkingBoy;
import com.parkingLot.parkingLot.domin.ParkingLot;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class ParkingBoyService {

    public Map<Integer,ParkingBoy> parkingBoysList = new LinkedHashMap<>();
    int parkingBoyId = 1;

    public ParkingBoy addParkingBoy(ParkingBoy request) {
        request.setId(parkingBoyId);
        parkingBoyId ++;
        parkingBoysList.put(parkingBoyId,request);
        return request;
    }
}
