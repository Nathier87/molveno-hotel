package com.capgemini.molveno.hotel.guest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guest {

    List<String> list = new ArrayList<>();
    Scanner obj = new Scanner(System.in);

    public void getName() {
        System.out.println("Name:");
        list.add(obj.nextLine());
    }


    public void getLastName() {
        System.out.println("Last name:");
        list.add(obj.nextLine());
    }

    public void getTel() {
        System.out.println("Tel:");
        list.add(obj.nextLine());
    }

    public void getAddress() {
        System.out.println("Address:");
        list.add(obj.nextLine());
    }
    public void getEmail() {
        System.out.println("Email:");
        list.add(obj.nextLine());
    }
    public void getIdType() {
        System.out.println("IdentityType:");
        list.add(obj.nextLine());
    }
    public void getIdValue() {
        System.out.println("IdentityValue:");
        list.add(obj.nextLine());
    }



}
