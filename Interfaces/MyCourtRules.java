package com.xworkz.interfaces.rules;

public class MyCourtRules implements CourtRules {
    @Override
    public void dressCode() {
        System.out.println("1.Follow the prescribed dress code for court appearances.");
    }

    @Override
    public void caseFilingProcedure() {
        System.out.println("2.Adhere to the procedure for filing a case in the court.");
    }

    @Override
    public void evidenceSubmission() {
        System.out.println("3.Submit evidence following the court's submission guidelines.");
    }

    @Override
    public void trialProcess() {
        System.out.println("4.Understand and follow the procedures involved in the trial.");
    }

    @Override
    public void appealProcess() {
        System.out.println("5.Understand the process and requirements for filing an appeal.");
    }

    public void printCourtTimings() {
        System.out.println("Court Opening Time: " + COURT_OPENING_TIME);
        System.out.println("Court Closing Time: " + COURT_CLOSING_TIME);
        System.out.println("---------------");
    }
}
