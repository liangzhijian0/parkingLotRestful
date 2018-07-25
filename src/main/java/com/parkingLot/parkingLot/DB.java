package com.parkingLot.parkingLot;

import com.parkingLot.parkingLot.domin.ParkingBoy;
import com.parkingLot.parkingLot.domin.ParkingLot;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DB {
    private static Map<Integer,ParkingLot> parkingLotsList = new LinkedHashMap<>();
    private static int parkingLotId = 1;
    private static Map<Integer,ParkingBoy> parkingBoysList = new LinkedHashMap<>();
    private static int parkingBoyId = 1;

    public static Map<Integer, ParkingLot> getParkingLotsList() {
        return parkingLotsList;
    }

    public static void setParkingLotsList(Map<Integer, ParkingLot> parkingLotsList) {
        DB.parkingLotsList = parkingLotsList;
    }

    public static int getParkingLotId() {
        return parkingLotId;
    }

    public static void setParkingLotId(int parkingLotId) {
        DB.parkingLotId = parkingLotId;
    }

    public static ParkingLot addParkingLot(ParkingLot request) {
        request.setId(parkingLotId);
        parkingLotId ++;
        parkingLotsList.put(parkingLotId,request);
        return request;
    }

    public static ParkingBoy addParkingBoy(ParkingBoy request) {
        request.setId(parkingBoyId);
        parkingBoysList.put(parkingBoyId,request);
        parkingBoyId ++;
        return request;
    }

    public static ParkingBoy manageParkingLotToParkingBoy(int ParkingBoysId,ParkingLot request) {
        request.setId(parkingLotId);
        parkingLotsList.put(parkingLotId,request);
        parkingLotId ++;

        ParkingBoy parkingBoy = parkingBoysList.get(ParkingBoysId);
        List<ParkingLot> list = parkingBoy.getParkingLotsList();
        list.add(request);
        parkingBoy.setParkingLotsList(list);
        return parkingBoy;
    }
}