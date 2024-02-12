package com.xworkz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankApplicationPreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/Application";
        String username = "root";
        String password = "Xworkzodc@123";
        String query="insert into bank values(?,?,?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(jdbcUrl,username,password);
           preparedStatement = connection.prepareStatement(query);
           preparedStatement.setInt(1,101);
           preparedStatement.setString(2,"Rbi");
            preparedStatement.setString(3,"sanjay colony");
            preparedStatement.setString(4,"san001234");
            preparedStatement.setString(5,"Bhadravathi");
            preparedStatement.setInt(1,110);
            preparedStatement.setString(2,"sbm");
            preparedStatement.setString(3,"bhadra colony");
            preparedStatement.setString(4,"bha0033");
            preparedStatement.setString(5,"bhadaravathi");
            preparedStatement.execute();


            System.out.println("Inserted");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
