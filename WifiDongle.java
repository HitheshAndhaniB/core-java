package com.equalsmethod.in;

public class WifiDongle {
    public String brand;
    public int transferRate;
    public int itemWeight;
    public WifiDongle(String brand,int transferRate,int itemWeight) {
        this.brand = brand;
        this.transferRate=transferRate;
        this.itemWeight=itemWeight;
        System.out.println("created wifiDongle using String int int arg const");
    }

    @Override
    public String toString() {
        return "WifiDongke info:brand:"+this.brand +" transferRate:"+this.transferRate +"kb/s"+"  itemWeight:"+this.itemWeight+"gm";
    }

    @Override
    public boolean equals(Object obj) {
        WifiDongle LeftRef=this;
        if(obj!=null) {
            if (obj instanceof WifiDongle) {
                WifiDongle RightRef = (WifiDongle) obj;//casting
                if (LeftRef.itemWeight == RightRef.itemWeight && LeftRef.transferRate == RightRef.transferRate){
                    System.out.println("wifidongle &wifidongle1 itemWeight &transferRate are same");

                    return true;
                }
            }
        }
        return false;
    }
}
