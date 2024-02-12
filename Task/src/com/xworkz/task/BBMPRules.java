package com.xworkz.task;
public interface BBMPRules extends BDARules {
    int MAXIMUM_TREE_CUT = 5;
    String TREE_CUTTING_AUTHORITY = "BBMP Arborist";



    void checkTreeCutLimit();
    void treeCuttingAuthorityDetails();
}

