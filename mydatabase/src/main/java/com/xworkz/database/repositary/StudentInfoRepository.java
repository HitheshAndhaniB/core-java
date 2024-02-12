package com.xworkz.database.repositary;

import com.xworkz.database.dto.StudentInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public interface StudentInfoRepository {

    public void insertinfo(List<StudentInfo> studentInfo);

    public void insertInfoAll(List<StudentInfo> studentInfos);

    void insertinfo(StudentInfo studentInfoService);

    public void update(String name, String branch);
}


