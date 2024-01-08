package com.xworkz.interfaces.rules;

public interface   HospitalRules {
     String visitingHours = "9 AM to 7 PM";
     int maxVisitorsPerPatient = 2;

    // Abstract methods
    public abstract void emergencyProcedures();
    public abstract void dischargeProcess();
    public abstract void doctorRounds();
    public abstract void appointmentScheduling();
}

