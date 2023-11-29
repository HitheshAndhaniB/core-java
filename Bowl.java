package com.toString.in;

public class Bowl {
    String bowlType;
    int bowlSize;

    public Bowl(String bowlType, int bowlSize) {
        this.bowlType = bowlType;
        this.bowlSize = bowlSize;
    }

    @Override
    public String toString() {
        System.out.println("RUnning tostring in Bowl ");

        return "Bowl info={" +
                "bowlType='" + bowlType + '\'' +
                ", bowlSize=" + bowlSize +
                '}';
    }
}
