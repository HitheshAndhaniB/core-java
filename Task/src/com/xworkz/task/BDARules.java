package com.xworkz.task;
public interface BDARules extends GovtRules {
    int BUILDING_HEIGHT_LIMIT = 50;
    String BUILDING_CONSTRUCTION_AUTHORITY = "Local Municipality";
    void checkBuildingHeightLimit();
    void constructionAuthorityDetails();
}

