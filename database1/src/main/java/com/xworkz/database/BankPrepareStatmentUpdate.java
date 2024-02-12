package com.xworkz.database;

import java.sql.*;

public class BankPrepareStatmentUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/Application";
        String username = "root";
        String password = "Xworkzodc@123";
        String query="update bank set branch = ? where name = ? and location = ?";
        try {
           Connection connection1 = DriverManager.getConnection(jdbcUrl,username,password);
           PreparedStatement preparedStatement = connection1.prepareStatement(query);

            preparedStatement.setString(1,"canara");
            preparedStatement.setString(2,"jayanagar");
            preparedStatement.setString(3,"Banglore");
            preparedStatement.execute();
            System.out.println("Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
