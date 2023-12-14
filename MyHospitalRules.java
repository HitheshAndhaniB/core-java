package com.xworkz.interfaces.rules;
public class MyHospitalRules implements HospitalRules {
    @Override
    public void emergencyProcedures() {
        System.out.println("1.Follow emergency protocols in critical situations.");
    }

    @Override
    public void dischargeProcess() {
        System.out.println("2.Ensure smooth discharge process for patients leaving the hospital.");
    }

    @Override
    public void doctorRounds() {
        System.out.println("3.Regular doctor rounds for patient check-ups are conducted.");
    }

    @Override
    public void appointmentScheduling() {
        System.out.println("4.Appointments for consultations are scheduled as per availability.");
    }

    public void printVisitingHoursAndLimit() {
        System.out.println("Visiting Hours: " + visitingHours);
        System.out.println("Max Visitors per Patient: " + maxVisitorsPerPatient);
        System.out.println("---------------");
    }
}

