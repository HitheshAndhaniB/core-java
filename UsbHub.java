package com.equalsmethod.in;


public class UsbHub {
    public int totalPorts;
    public int transferRate;
    public int reqBattery;

    public UsbHub(int totalPorts,int transferRate,int reqBattery){
        this.totalPorts=totalPorts;
        this.transferRate=transferRate;
        this.reqBattery=reqBattery;
        System.out.println("created UsbHub using int int int arg const");
    }

    @Override
    public String toString(){
        return "UsbHub info: totalPorts:"+this.totalPorts + "  transferRate:"+ this.transferRate +
                " reqBattery:"+this.reqBattery;
    }

    @Override
    public boolean equals(Object obj) {
        UsbHub LeftRef= this;
        if(obj!=null){
            if(obj instanceof UsbHub){
                UsbHub RightRef=(UsbHub) obj;
                if(LeftRef.totalPorts==RightRef.totalPorts && LeftRef.transferRate==RightRef.transferRate && LeftRef.reqBattery==RightRef.reqBattery);
                System.out.println("usbhub &usbhub2 totalPorts&transferRate&reqBattery are same");
                return true;
            }
        }
        return false;    }

}
