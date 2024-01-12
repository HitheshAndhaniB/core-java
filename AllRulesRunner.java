package com.xworkz.interfaces.rules;


public class AllRulesRunner {

    public static void main(String[] args) {
        MyTempleRules templeRules = new MyTempleRules();
        System.out.println("temple rules is");
        templeRules.dressCode();
        templeRules.crowdManagement();
        templeRules.festivalCelebrations();
        templeRules.cleanlinessStandards();
        templeRules.donationProcess();
        System.out.println("---------------------------");
        MyCourtRules myCourtRules=new MyCourtRules();
        myCourtRules.printCourtTimings();
        System.out.println("court rules is");
        myCourtRules.dressCode();
        myCourtRules.caseFilingProcedure();
        myCourtRules.evidenceSubmission();
        myCourtRules.trialProcess();
        myCourtRules.appealProcess();
        System.out.println("----------------------------");
        System.out.println("Forest rules");
        ForestRules forestRules = new MyForestRules();
        forestRules.campingRegulations();
        forestRules.fireSafetyRules();
        forestRules.emergencyProcedures();
        forestRules.entryPermits();
        forestRules.wildlifeInteraction();
        System.out.println("----------------------------");
        System.out.println("Hospital rules");
        HospitalRules hospitalRules =new MyHospitalRules();
        hospitalRules.appointmentScheduling();
        hospitalRules.doctorRounds();
        hospitalRules.dischargeProcess();
        hospitalRules.emergencyProcedures();
        System.out.println("----------------------------");
        System.out.println("Hostel rules");
        HostelRules hostelRules=new MyHostelRules();
        hostelRules.visitationRules();
        hostelRules.breakfastTime();
        hostelRules.coffeTime();
        hostelRules.lightsOut();
        System.out.println("----------------------------");


    }
}
