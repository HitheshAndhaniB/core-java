package com.xworkz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
    public static void main(String[] args) throws ClassNotFoundException {
        Connection connection=null;
        Statement statement=null;
        Class.forName("com.mysql.jdbc.Driver");
        String jdbcUrl = "jdbc:mysql://localhost:3306/Student";
        String userName = "root";
        String password = "Xworkzodc@123";
        String inserQuery = "insert into Student values(1,'Anil','MCA','BMS')";
        String inserQuery1 = "insert into Student values(2, 'John', 'BSC', 'XYZ')";
        String inserQuery2 = "insert into Student values(3, 'Alice', 'MBA', 'ABC')";
        String inserQuery3 = "insert into Student values(4, 'Bob', 'MSC', 'PQR')";
        String inserQuery4 = "insert into Student values(5, 'Charlie', 'BBA', 'LMN')";
        String inserQuery5 = "insert into Student values(6, 'David', 'PHD', 'EFG')";
        String inserQuery6 = "insert into Student values(7, 'Eva', 'M.Tech', 'UVW')";
        String inserQuery7 = "insert into Student values(8, 'Frank', 'B.Com', 'RST')";
        String inserQuery8 = "insert into Student values(9, 'Grace', 'BCA', 'HIJ')";
        String inserQuery9 = "insert into Student values(10, 'Henry', 'MSW', 'JKL')";
        try {
            connection=DriverManager.getConnection(jdbcUrl,userName,password);
            System.out.println("connection is successfull");
             statement = connection.createStatement();
            boolean result = statement.execute(inserQuery);
            boolean result1 = statement.execute(inserQuery1);
            boolean result2= statement.execute(inserQuery2);
            boolean result3= statement.execute(inserQuery3);
            boolean result4= statement.execute(inserQuery4);
            boolean result5= statement.execute(inserQuery5);
            boolean result6 = statement.execute(inserQuery6);
            boolean result7= statement.execute(inserQuery7);
            boolean result8= statement.execute(inserQuery8);
            boolean result9 = statement.execute(inserQuery9);


            System.out.println(result);
            System.out.println("inserted data into Student");
            System.out.println("connection to database is sucessfull!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

