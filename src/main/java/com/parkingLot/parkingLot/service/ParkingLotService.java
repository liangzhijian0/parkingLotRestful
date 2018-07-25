package com.parkingLot.parkingLot.service;

import com.parkingLot.parkingLot.domin.ParkingLot;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class ParkingLotService {

    public Map<Integer,ParkingLot> parkingLotsList = new LinkedHashMap<>();
    int parkingLotId = 1;

    public ParkingLot addParkingLot(ParkingLot request) {
        request.setId(parkingLotId);
        parkingLotId ++;
        parkingLotsList.put(parkingLotId,request);
        return request;
    }
}
