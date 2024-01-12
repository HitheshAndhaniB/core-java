package com.toString.in;

public class Seed {
    String seedType;
    int seedQuantity;

    public Seed(String seedType, int seedQuantity) {
        this.seedType = seedType;
        this.seedQuantity = seedQuantity;
    }

    @Override
    public String toString() {
        return "Seed info={" +
                "seedType='" + seedType + '\'' +
                ", seedQuantity=" + seedQuantity +
                '}';
    }
}
