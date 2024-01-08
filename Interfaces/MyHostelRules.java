package com.xworkz.interfaces.rules;

public class MyHostelRules implements HostelRules {
    @Override
    public void lightsOut() {
        System.out.println("1.Lights out at specified time for dormitories.");
    }

    @Override
    public void breakfastTime() {
        System.out.println("2.Breakfast served from 7 AM to 9 AM in the cafeteria.");
    }

    @Override
    public void coffeTime() {
        System.out.println("3.Coffee available in the common area from 4 PM to 6 PM.");
    }

    @Override
    public void visitationRules() {
        System.out.println("4.Visitors allowed only during designated visiting hours.");
    }

    public void printCheckInOutTimes() {
        System.out.println("Check-out Time: " + checkOutTime);
        System.out.println("Check-in Time: " + checkInTime);
        System.out.println("---------------");
    }
}
