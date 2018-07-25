package com.parkingLot.parkingLot.domin;

public class Receipt {
    private int id;
    private boolean status;

    public Receipt(int id, boolean status) {
        this.id = id;
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Receipt(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
