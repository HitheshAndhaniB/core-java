package com.xworkz.task;
public interface SewageRules {
    int MAXIMUM_ALLOWABLE_POLLUTION_LEVEL = 5;
    String SEWAGE_DISPOSAL_METHOD = "Treatment Plant";
    void sewageDisposalGuidelines();
    void checkPollutionLevels();
}
