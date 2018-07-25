package com.parkingLot.parkingLot;

import com.parkingLot.parkingLot.domin.*;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DB {
    private static Map<Integer,ParkingLot> parkingLotsList = new LinkedHashMap<>();
    private static Map<Integer,ParkingBoy> parkingBoysList = new LinkedHashMap<>();
    private static Map<Integer,Receipt> receiptsList = new LinkedHashMap<>();
    private static Map<Receipt,Car> receiptCar = new LinkedHashMap<>();
    private static Map<Integer,Order> ordersList = new LinkedHashMap<>();

    private static int parkingLotId = 1;
    private static int parkingBoyId = 1;
    private static int receiptId = 1;
    private static int orderId = 1;

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

    public static Receipt park(Car car){
        Receipt receipt = new Receipt(receiptId,true);
        receiptsList.put(receiptId,receipt);
        receiptCar.put(receipt,car);
        receiptId ++ ;

        Order order = new Order(orderId,true);
        ordersList.put(orderId,order);
        orderId ++ ;
        return receipt;
    }

    public static Car unpark(int receiptsId) {
        for(Receipt key : receiptCar.keySet()){
            if(key.getId() == receiptsId){
                Car resultCar = receiptCar.get(key);
                receiptCar.remove(key);
                receiptsList.get(receiptsId).setStatus(false);
                return resultCar;
            }
        }
        return null;
    }

    public static List<Order> getAllOrder() {
        return new LinkedList<>(ordersList.values());
    }

    public static List<Order> getOrderByStatus(boolean OrderStatus) {
        List<Order> orders = new LinkedList<>(ordersList.values());
        return orders.stream().filter(order -> order.isStatus() == OrderStatus).collect(Collectors.toList());
    }
}
