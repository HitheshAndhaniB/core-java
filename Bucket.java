package com.toString.in;

public class Bucket {
    int bucketSize;
    double bucketPrice;

    public Bucket(int bucketSize, double bucketPrice) {
        this.bucketSize = bucketSize;
        this.bucketPrice = bucketPrice;
    }

    @Override
    public String toString() {
        System.out.println("RUnning tostring in Bucket ");

        return "Bucket info={" +
                "bucketSize=" + bucketSize +
                ", bucketPrice=" + bucketPrice +
                '}';
    }
}
