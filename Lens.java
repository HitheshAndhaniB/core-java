package com.toString.in;

public class Lens {
    String lensBrand;
    double lensPoints;
    String type;

    public Lens(String lensBrand, double lensPoints, String type) {
        this.lensBrand = lensBrand;
        this.lensPoints = lensPoints;
        this.type = type;
    }

    @Override
    public String toString() {
        System.out.println("running tostring in Lens");
        return "Lens info={" +
                "lensBrand='" + lensBrand + '\'' +
                ", lensPoints=" + lensPoints +
                ", type='" + type + '\'' +
                '}';
    }
}
