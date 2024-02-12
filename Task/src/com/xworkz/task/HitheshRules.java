package com.xworkz.task;

public class HitheshRules implements LibraryRule{

    public HitheshRules() {
        super();
    }

    @Override
    public boolean keepSilence() {
        return true;
    }

    @Override
    public String memberId() {
        return "id_no=1";
    }

    @Override
    public boolean
    openingTime() {
        return true;
    }

    @Override
    public String closingTime() {
        return "evening-6:30";
    }
}
