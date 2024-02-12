package com.xworkz.database.runner;

import com.xworkz.database.dto.StudentInfo;
import com.xworkz.database.repositary.StudentInfoRepository;
import com.xworkz.database.repositary.StudentInfoRepositoryImpl;
import com.xworkz.database.service.StudentInfoService;
import com.xworkz.database.service.StudentInfoSeviceImpl;

import java.util.ArrayList;
import java.util.List;

public class StudentInfoRunner {
    public static void main(String[] args) {
        StudentInfoRepository studentInfoRepository = new StudentInfoRepositoryImpl();
        StudentInfo studentInfo = new StudentInfo(1,"Hithesh","mca","Bdvt");
        StudentInfoService studentInfoService = new StudentInfoSeviceImpl();
        studentInfoService.studentinfo(studentInfo);

StudentInfoService studentInfoService1 = new StudentInfoSeviceImpl();
studentInfoService1.update("Hithesh","mca");

    }
}
