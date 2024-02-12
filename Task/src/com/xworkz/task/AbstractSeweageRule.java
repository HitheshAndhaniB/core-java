package com.xworkz.task;

public abstract class AbstractSeweageRule implements SewageRules {
    private String ruleName="FolloeRules";


    public AbstractSeweageRule() {
        super();
    }



    public   abstract void  hithesh();
    @Override
    public void sewageDisposalGuidelines() {
        System.out.println("Sewage Disposal Guidelines Rules ");

    }

    @Override
    public void checkPollutionLevels() {
        System.out.println("check Pollution Levels Rules");

    }
}
