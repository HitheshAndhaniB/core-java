package com.xworkz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankApplicationUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/Application";
        String userName = "root";
        String password = "Xworkzodc@123";
        String updateQuery =" update bank set id = 101 where id = 1";
        String updateQuery1 =" update bank set id = 102 where id = 2";
        String updateQuery2 =" update bank set id = 103 where id = 3";
        String updateQuery3 =" update bank set id = 104 where id = 4";
        String updateQuery4 =" update bank set id = 105 where id = 5";
        String updateQuery5 =" update bank set id = 106 where id = 6";
        String updateQuery6 =" update bank set id = 107 where id = 7";

        try {
            Connection connection= DriverManager.getConnection(jdbcUrl, userName, password);
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(updateQuery);
            int result1 = statement.executeUpdate(updateQuery1);
            int result2 = statement.executeUpdate(updateQuery2);
            int result3 = statement.executeUpdate(updateQuery3);
            int result4 = statement.executeUpdate(updateQuery4);
            int result5 = statement.executeUpdate(updateQuery5);
            int result6 = statement.executeUpdate(updateQuery6);
            System.out.println(result);
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
            System.out.println(result5);
            System.out.println(result6);
            System.out.println("Updated data into bank");
            System.out.println("connection to database is sucessfull!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    }

