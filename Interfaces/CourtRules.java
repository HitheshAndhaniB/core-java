package com.xworkz.interfaces.rules;

public interface  CourtRules {
   String COURT_OPENING_TIME = "9 AM";
   String COURT_CLOSING_TIME = "5 PM";
    public abstract void dressCode();

    public abstract void caseFilingProcedure();

    public abstract void evidenceSubmission();

    public abstract void trialProcess();

    public abstract void appealProcess();
}

