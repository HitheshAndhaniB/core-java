package com.xworkz.database.service;

import com.xworkz.database.dto.StudentInfo;

import java.util.List;

public interface StudentInfoService {

    public  void studentinfo(StudentInfo studentInfoService);

    public  void  insertInfoAll(List<StudentInfo> studentInfos);

    public void update(String name, String branch);

}
