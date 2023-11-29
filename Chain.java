package com.toString.in;

public class Chain {
    String chainType;
    double chainPrice;
    String chainSize;

    public Chain(String chainType, double chainPrice, String chainSize) {
        this.chainType = chainType;
        this.chainPrice = chainPrice;
        this.chainSize = chainSize;
    }

    @Override
    public String toString() {
        System.out.println("RUnning tostring in Chain ");
        return "Chain info={" +
                "chainType='" + chainType + '\'' +
                ", chainPrice=" + chainPrice +
                ", chainSize='" + chainSize + '\'' +
                '}';
    }
}
