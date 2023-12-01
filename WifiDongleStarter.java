package com.equalsmethod.in;


public class WifiDongleStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in WIfiDongleStarter");
        WifiDongle wifiDongle=new WifiDongle("jio",3,50);
        WifiDongle wifiDongle1=new WifiDongle("jio",3,50);
        boolean same=wifiDongle.equals(wifiDongle1);
        System.out.println(same);
        System.out.println("Ending main in WIfiDongleStarter");


    }
}
