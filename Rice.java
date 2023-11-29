package com.toString.in;

public class Rice {
    String riceBrand;
    int riceQuantity;
    String riceQuality;


    public Rice(String riceBrand, int riceQuantity, String riceQuality) {
        this.riceBrand = riceBrand;
        this.riceQuantity = riceQuantity;
        this.riceQuality = riceQuality;
    }

    @Override
    public String toString() {
        System.out.println("RUnning tostring in Rice ");

        return "Rice info={" +
                "riceBrand='" + riceBrand + '\'' +
                ", riceQuantity=" + riceQuantity +
                ", riceQuality='" + riceQuality + '\'' +
                '}';
    }
}
