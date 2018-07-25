package com.parkingLot.parkingLot.domin;

import java.util.LinkedList;
import java.util.List;

public class ParkingBoy {
    private int id;
    private String name;
    private List<ParkingLot> parkingLotsList = new LinkedList<>();

    public ParkingBoy() {
    }

    public ParkingBoy(int id, String name, List<ParkingLot> parkingLotsList) {
        this.id = id;
        this.name = name;
        this.parkingLotsList = parkingLotsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingLot> getParkingLotsList() {
        return parkingLotsList;
    }

    public void setParkingLotsList(List<ParkingLot> parkingLotsList) {
        this.parkingLotsList = parkingLotsList;
    }
}
