package com.toString.in;

public class Mic {
    double micCost;
    String micBrand;
    String micType;


    public Mic(double micCost, String micBrand, String micType) {
        this.micCost = micCost;
        this.micBrand = micBrand;
        this.micType = micType;
    }

    @Override
    public String toString() {
        System.out.println("RUnning tostring in Mic ");

        return "Mic info={" +
                "micCost=" + micCost +
                ", micBrand='" + micBrand + '\'' +
                ", micType='" + micType + '\'' +
                '}';
    }
}
