package com.xworkz.database;

import java.sql.*;

public class StudentFetch {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/Student";
        String username = "root";
        String password = "Xworkzodc@123";
        String fetchQuery = "Select * from Student ";
        Connection connection = null;
        Statement statement=null;
        try {
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(fetchQuery);
            System.out.println(resultSet);
            while(resultSet.next()) {
                System.out.println(resultSet.getInt("id")+" "+resultSet.getString("name")+" "+resultSet.getString("branch")+"  "+resultSet.getString("college_name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}