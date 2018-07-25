package com.parkingLot.parkingLot.domin;

public class ParkingLot {
    private int id;
    private String Name;
    private int size;

    public ParkingLot() {
    }

    public ParkingLot(int id, String name, int size) {
        this.id = id;
        Name = name;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
