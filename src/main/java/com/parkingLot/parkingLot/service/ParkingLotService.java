package com.parkingLot.parkingLot.service;

import com.parkingLot.parkingLot.DB;
import com.parkingLot.parkingLot.domin.ParkingLot;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class ParkingLotService {

    public ParkingLot addParkingLot(ParkingLot request) {
        return  DB.addParkingLot(request);
    }

    public ParkingLot deleteParkingLot(int id) {
        return DB.deleteParkingLot(id);
    }
}
