package com.xworkz.database.Services;

import com.xworkz.database.Dto.DamInfo;

public interface DamServices {
    public  void insertInfo(DamInfo damInfo);

    public  void updateinfo(int height , String place);

    public  DamInfo findByName(String place);


}
