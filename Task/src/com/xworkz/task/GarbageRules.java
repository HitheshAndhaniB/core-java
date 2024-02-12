package com.xworkz.task;

public interface GarbageRules extends SewageRules {
    int MAXIMUM_GARBAGE_CAPACITY = 100;
    String GARBAGE_DISPOSAL_METHOD = "Recycling";
    void garbageDisposalGuidelines();
    void checkGarbageCapacity();
}

