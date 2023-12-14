package com.xworkz.interfaces.rules;

public class MyTempleRules implements TempleRules {




    @Override
    public void dressCode() {
        System.out.println("1.Dress modestly and respectfully when visiting the temple.");
    }

    @Override
    public void crowdManagement() {
        System.out.println("2.Follow queues and instructions for better crowd management.");
    }

    @Override
    public void festivalCelebrations() {
        System.out.println("3.Participate in the festival celebrations with joy and devotion.");
    }

    @Override
    public void cleanlinessStandards() {
        System.out.println("4.Help maintain the cleanliness of the temple premises.");
    }

    @Override
    public void donationProcess() {
        System.out.println("4.Donations can be made at designated counters.");
    }

    public void printTimingsAndLimits() {
        System.out.println("Temple Opening Time: " + OPENING_TIME);
        System.out.println("Temple Closing Time: " + CLOSING_TIME);
        System.out.println("---------------");
    }
}
