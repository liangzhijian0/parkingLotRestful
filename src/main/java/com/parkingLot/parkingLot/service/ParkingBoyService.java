package com.parkingLot.parkingLot.service;

import com.parkingLot.parkingLot.domin.ParkingBoy;
import com.parkingLot.parkingLot.domin.ParkingLot;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class ParkingBoyService {

    public Map<Integer,ParkingBoy> parkingBoysList = new LinkedHashMap<>();
    int parkingBoyId = 1;

    public ParkingBoy addParkingBoy(ParkingBoy request) {
        request.setId(parkingBoyId);
        parkingBoysList.put(parkingBoyId,request);
        parkingBoyId ++;
        return request;
    }

    public ParkingBoy manageParkingLotToParkingBoy(int ParkingBoysId,ParkingLot request) {
        System.out.println(ParkingBoysId);
        ParkingLotService parkingLotService = new ParkingLotService();
        request.setId(parkingLotService.parkingLotId);
        parkingLotService.parkingLotId ++;
        parkingLotService.parkingLotsList.put(parkingLotService.parkingLotId,request);
        ParkingBoy parkingBoy = parkingBoysList.get(ParkingBoysId);
        System.out.println(parkingBoy.getName());
        List<ParkingLot> a = parkingBoy.getParkingLotsList();
        a.add(request);
        parkingBoy.setParkingLotsList(a);
        return parkingBoy;
    }
}
