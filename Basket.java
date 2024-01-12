package com.toString.in;

public class Basket {
    double basketPrice;
    int basketSize;
    String basketType;

    public Basket(double basketPrice, int basketSize, String basketType) {
        this.basketPrice = basketPrice;
        this.basketSize = basketSize;
        this.basketType = basketType;
    }

    @Override
    public String toString() {
        System.out.println("RUnning tostring in Basket ");

        return "Basket info={" +
                "basketPrice=" + basketPrice +
                ", basketSize=" + basketSize +
                ", basketType='" + basketType + '\'' +
                '}';
    }
}
