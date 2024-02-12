package com.xworkz.database.service;

import com.xworkz.database.dto.StudentInfo;
import com.xworkz.database.repositary.StudentInfoRepository;
import com.xworkz.database.repositary.StudentInfoRepositoryImpl;

import java.util.List;

public class StudentInfoSeviceImpl implements StudentInfoService {
    StudentInfoRepository studentInfoRepository = new StudentInfoRepositoryImpl();

    @Override
    public void studentinfo(StudentInfo studentInfoService) {
        if (studentInfoService.getRool_no() == 0) {
            System.out.println("please enter valid Roll number");
        } else {
            studentInfoRepository.insertinfo(studentInfoService);
        }


    }

    @Override
    public void insertInfoAll(List<StudentInfo> studentInfos) {

    }

    @Override
    public void update(String name, String branch) {
        StudentInfoRepository studentInfoRepository1 = new StudentInfoRepositoryImpl();
        if (name == null){
            System.out.println("enter valid name");
        }
        else {
            studentInfoRepository1.update(name,branch);
        }
    }
}

