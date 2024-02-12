package com.xworkz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/Student";
        String userName = "root";
        String password = "Xworkzodc@123";
        String updateQuery =" update student set id = 101 where id = 1";
        String updateQuery1 =" update student set id = 102 where id = 2";
        String updateQuery2=" update student set id = 103 where id = 3";
        String updateQuery3=" update student set id = 104 where id = 4";
        String updateQuery4=" update student set id = 105 where id = 5";
        String updateQuery5=" update student set id = 106 where id = 5";
        String updateQuery6=" update student set id = 107 where id = 6";
        String updateQuery7=" update student set id = 108 where id = 7";
        String updateQuery8 =" update student set id = 109 where id = 8";
        String updateQuery9 =" update student set id = 110 where id = 9";

        try {
            Connection connection= DriverManager.getConnection(jdbcUrl, userName, password);
            Statement statement = connection.createStatement();
            boolean result = statement.execute(updateQuery);
            System.out.println(result);
            System.out.println("Updated data into Student");
            System.out.println("connection to database is sucessfull!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
