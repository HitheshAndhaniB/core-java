package com.xworkz.database;

import java.sql.*;

public class PrepareStatementDelete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/Application";
        String username = "root";
        String password = "Xworkzodc@123";
        String query="update bank set branch = ?,location =? where name = ? ";
        try {
            Connection connection1 = DriverManager.getConnection(jdbcUrl,username,password);
            PreparedStatement preparedStatement = connection1.prepareStatement(query);
            preparedStatement.setString(3,"SBI");
            preparedStatement.setString(2,"mangalore");
            preparedStatement.setString(1,"BTM");
            preparedStatement.execute();
            preparedStatement.setString(1,"Chandra Layout");
            preparedStatement.setString(2,"banglore");
            preparedStatement.setString(3,"RBI");
            preparedStatement.execute();
            System.out.println("Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}