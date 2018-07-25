package com.parkingLot.parkingLot.domin;

public class Receipt {
    private String  id;
    private boolean status;

    public Receipt(String id, boolean status) {
        this.id = id;
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
