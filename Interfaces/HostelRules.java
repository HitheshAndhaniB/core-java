package com.xworkz.interfaces.rules;

public interface   HostelRules {
      int checkOutTime = 10;
      int checkInTime = 12;
    public abstract void lightsOut();

    public abstract void breakfastTime();

    public abstract void coffeTime();

    public abstract void visitationRules();

}
