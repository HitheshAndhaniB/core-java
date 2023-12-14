package com.xworkz.interfaces.rules;

public class MyForestRules implements ForestRules {
    @Override
    public void wildlifeInteraction() {
        System.out.println("1.Observe wildlife from a safe distance without disturbing them.");
    }

    @Override
    public void campingRegulations() {
        System.out.println("2.Follow designated camping spots and adhere to regulations.");
    }

    @Override
    public void fireSafetyRules() {
        System.out.println("3.Strictly follow fire safety guidelines to prevent forest fires.");
    }

    @Override
    public void entryPermits() {
        System.out.println("4.Obtain necessary permits before entering the forest area.");
    }

    @Override
    public void emergencyProcedures() {
        System.out.println("5.Know emergency procedures and contacts in case of emergencies.");
    }

    public void printVisitingHoursAndGroupSize() {
        System.out.println("Visiting Hours: " + VISITING_HOURS);
        System.out.println("Max Group Size: " + MAX_GROUP_SIZE);
        System.out.println("---------------");
    }
}
