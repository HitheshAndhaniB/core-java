package com.xworkz.task;

public abstract class MetroContracter extends Contracter implements GarbageRules {
    int metroRules=5;

    public MetroContracter() {
        super();
    }



    @Override
    public void sewageDisposalGuidelines() {
        System.out.println("sewage Disposal Guidelines rules is override");
        super.sewageDisposalGuidelines();
    }

    @Override
    public void checkPollutionLevels() {
        System.out.println("check Pollution Levels rules is obverride");
        super.checkPollutionLevels();
    }

    @Override
    public void garbageDisposalGuidelines() {
        System.out.println("check Pollution Levels rule");

    }

    @Override
    public void checkGarbageCapacity() {
        System.out.println("check Garbage Capacity ");

    }
}
