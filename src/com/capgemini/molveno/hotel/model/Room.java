package com.capgemini.molveno.hotel.model;

import java.time.LocalDateTime;

public class Room {
    final int MAX_NUM_OF_ROOMS = 200;
    String roomType;
    int roomNumber, maxBeds;
    LocalDateTime checkInTime, checkOutTime;
    boolean isReserved, isCleaned;
    double price;

    public boolean cleanRoom(boolean isCleaned) {
        this.isCleaned = true;
        return isCleaned;
    }

    public boolean reserveRoom(boolean isReserved, int roomNumber) {
        this.isReserved = true;
        this.roomNumber = roomNumber;
        return isReserved;
    }

    public double getPrice(String roomType) {
        switch (roomType){
            case "x":
                price = 50;
                break;
            case "y":
                price = 75;
                break;
            case "z":
                price = 100;
                break;
            default:
                price = 80;
                break;
        }
        return price;
    }

    public void checkIn(){

    }

    public void checkOut(){

    }

}
