package com.toString.in;

public class Cotton {
    String cottonType;
    double cottonPrice;
    String cottonQuality;

    public Cotton(String cottonType, double cottonPrice, String cottonQuality) {
        this.cottonType = cottonType;
        this.cottonPrice = cottonPrice;
        this.cottonQuality = cottonQuality;
    }

    @Override
    public String toString() {
        System.out.println("RUnning tostring in Cotton ");
        return "Cotton info={" +
                "cottonType='" + cottonType + '\'' +
                ", cottonPrice=" + cottonPrice +
                ", cottonQuality='" + cottonQuality + '\'' +
                '}';
    }
}
