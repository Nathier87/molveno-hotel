package com.capgemini.molveno.hotel.model;

import java.time.LocalDateTime;

public class Guest {
    private String name;
    String lastName;
    String email;
    byte numGuest;
    LocalDateTime dateTime;
    int Tel;
    byte RoomNum;
    boolean CheckInOut;

    public Guest(String guestName){
        this.name= guestName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
