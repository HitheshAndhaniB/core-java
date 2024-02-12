package com.xworkz.database.Repository;

import com.xworkz.database.Dto.DamInfo;

public interface DamRepository {

    public  void insertInfo(DamInfo damInfo);

    public  void update(int height, String place);

    public  DamInfo findByName(String place);
}
