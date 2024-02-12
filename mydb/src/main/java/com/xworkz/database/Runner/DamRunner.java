package com.xworkz.database.Runner;

import com.xworkz.database.Dto.DamInfo;
import com.xworkz.database.Repository.DamRepository;
import com.xworkz.database.Repository.DamrepositoryImpl;
import com.xworkz.database.Services.DamServices;
import com.xworkz.database.Services.DamServicesImpl;

public class DamRunner {
    public static void main(String[] args) {


        DamRepository damRepository = new DamrepositoryImpl();
        DamInfo damInfo = new DamInfo(2,"krs", "mys", "karnataka", 100);
        DamServices damServices = new DamServicesImpl();
        damRepository.insertInfo(damInfo);

        DamRepository damRepository1 = new DamrepositoryImpl();
        DamInfo damInfo1 = new DamInfo();
        DamServices damServices1 = new DamServicesImpl();
//        damRepository1.update(182,"Shivmogga");

        DamInfo damInfo2 = damServices.findByName("Shivmogga");
        if(damInfo2==null){
            System.out.println("data is not fetch");
        }else{
            System.out.println("sucessfully fetch"+damInfo2.getPlace());
        }

    }
}
