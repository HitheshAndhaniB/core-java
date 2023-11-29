package com.toString.in;

public class Heart {
    String heartType;
    int heartAge;
    int heartBeat;

    public Heart(String heartType, int heartAge, int heartBeat) {
        this.heartType = heartType;
        this.heartAge = heartAge;
        this.heartBeat = heartBeat;
    }

    @Override
    public String toString() {
        System.out.println("RUnning tostring in Heart ");
        return "Heart info={" +
                "heartType='" + heartType + '\'' +
                ", heartAge=" + heartAge +
                ", heartBeat=" + heartBeat +
                '}';
    }
}
