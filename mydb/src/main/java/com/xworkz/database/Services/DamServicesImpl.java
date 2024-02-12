package com.xworkz.database.Services;

import com.xworkz.database.Dto.DamInfo;
import com.xworkz.database.Repository.DamRepository;
import com.xworkz.database.Repository.DamrepositoryImpl;

public class DamServicesImpl implements DamServices{
    @Override
   public void insertInfo(DamInfo damInfo) {
       DamRepository damRepository = new DamrepositoryImpl();
      if (damInfo.getName()==null){
           System.out.println("enter valid name");
      }
       else {
           damRepository.insertInfo(damInfo);
       }

    }

    @Override
    public void updateinfo(int height , String place) {
        DamRepository damRepository = new DamrepositoryImpl();
        if (height==180){
            System.out.println("enter valid data");
        }
        else {
            damRepository.update(height,place);
        }

    }

    @Override
    public DamInfo findByName(String place) {
        DamRepository damRepository = new DamrepositoryImpl();
        if (place==null){
            System.out.println("enter valid data");
        }else {

        DamInfo damServices = damRepository.findByName(place);
        return  damServices;
        }
        return null;
    }
}
