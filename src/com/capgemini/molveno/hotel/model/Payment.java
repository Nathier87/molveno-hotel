package com.capgemini.molveno.hotel.model;

public class Payment {

    public static void main(String[] args) {
        Payment d=new Payment();
        System.out.println(d.Payment(2));
    }
    public int Payment(int person){
        int result=0;
        switch (person){
            case 1:
                result = 10;
                break;
            case 2:
                result = 20;
                break;
            case 3:
                result = 30;
                break;
            case 4:
                result=30;
                break;
            default:
                result = -1;
                break;

        }
        return result;
    }

}
