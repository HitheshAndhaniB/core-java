package com.toString.in;

public class Locker {
    int lockerCost;
    String lockerType;
    String lockerWeight;


    public Locker(int lockerCost, String lockerType, String lockerWeight) {
        this.lockerCost = lockerCost;
        this.lockerType = lockerType;
        this.lockerWeight = lockerWeight;
    }

    @Override
    public String toString() {
        System.out.println("RUnning tostring in Locker ");

        return "Locker info={" +
                "lockerCost=" + lockerCost +
                ", lockerType='" + lockerType + '\'' +
                ", lockerWeight=" + lockerWeight +
                '}';
    }
}
