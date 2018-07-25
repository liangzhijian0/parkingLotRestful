package com.parkingLot.parkingLot.domin;

public class Order {
    private int id;
    private boolean status;

    public Order() {
    }

    public Order(int id, boolean status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
