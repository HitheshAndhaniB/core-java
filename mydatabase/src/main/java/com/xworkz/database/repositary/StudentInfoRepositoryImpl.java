package com.xworkz.database.repositary;

import com.xworkz.database.dto.StudentInfo;
import com.xworkz.database.runner.StudentInfoRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentInfoRepositoryImpl implements StudentInfoRepository {

//    @Override
//    public void insertinfo(List<StudentInfo> studentInfo) {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        String url = "jdbc:mysql://localhost:3306/Students";
//        String username = "root";
//        String password = "Xworkzodc@123";
//        String query = "insert into Student(roll_no,name,branch,place) values(?,?,?,?)";
//
//        try {
//           Connection connection = DriverManager.getConnection(url,username,password);
//           PreparedStatement preparedStatement = connection.prepareStatement(query);
//           preparedStatement.setInt(1,studentInfo.getRool_no());
//           preparedStatement.setString(2,studentInfo.getName());
//           preparedStatement.setString(3,studentInfo.getBranch());
//           preparedStatement.setString(4,studentInfo.getPlace());
//           preparedStatement.execute();
//            System.out.println("inserted sucessfully");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    @Override
    public void insertinfo(List<StudentInfo> studentInfo) {

    }

    @Override
    public void insertInfoAll(List<StudentInfo> studentInfos) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/Students";
        String username = "root";
        String password = "Xworkzodc@123";
        String query1 = "insert into Student(rool_no,name,branch,place) values(?,?,?,?)";

        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement=connection.prepareStatement(query1);
            for (StudentInfo booking:studentInfos
            ) {
                preparedStatement.setInt(1, booking.getRool_no());
                preparedStatement.setString(2,booking.getName());
                preparedStatement.setString(3,booking.getBranch());
                preparedStatement.setString(4, booking.getPlace());
                preparedStatement.execute();

                System.out.println("inserted");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void insertinfo(StudentInfo studentInfoService) {

    }

    @Override
    public void update(String name, String branch) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/Students";
        String usr = "root";
        String ps = "Xworkzodc@123";
        String qry = "update student set branch = ? where name = ?";

        try {
           Connection connection = DriverManager.getConnection(url,usr,ps);
           PreparedStatement preparedStatement = connection.prepareStatement(qry);
           preparedStatement.setString(1,"mmm");
           preparedStatement.setString(2,"Hithesh");
           preparedStatement.execute();

            System.out.println("updated");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
