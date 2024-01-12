package com.xworkz.interfaces.rules;

public interface ForestRules {
      String VISITING_HOURS = "6 AM to 6 PM";
      int MAX_GROUP_SIZE = 10;

    public abstract void wildlifeInteraction();
    public abstract void campingRegulations();

    public abstract void fireSafetyRules();

    public abstract void entryPermits();

    public abstract void emergencyProcedures();
}

