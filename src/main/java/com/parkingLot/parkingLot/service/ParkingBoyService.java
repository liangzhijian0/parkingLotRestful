package com.parkingLot.parkingLot.service;

import com.parkingLot.parkingLot.DB;
import com.parkingLot.parkingLot.domin.ParkingBoy;
import com.parkingLot.parkingLot.domin.ParkingLot;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@Component
public class ParkingBoyService {

    public ParkingBoy addParkingBoy(ParkingBoy request) {
        return DB.addParkingBoy(request);
    }

    public ParkingBoy manageParkingLotToParkingBoy(int ParkingBoysId,ParkingLot request) {
        return DB.manageParkingLotToParkingBoy(ParkingBoysId,request);
    }
}
