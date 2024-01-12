package com.equalsmethod.in;

public class UsbHubStarter {
    public static void main(String[] args) {
        System.out.println("starting main in UsbHubStarter");

        UsbHub usbHub=new UsbHub(4,600,3);
        UsbHub usbHub1=new UsbHub(5,750,3);
        boolean same=usbHub.equals(usbHub1);
        System.out.println(same);
        System.out.println(usbHub);
        System.out.println(usbHub1);

        System.out.println("Ending main in UsbHubStarter");
    }
}
