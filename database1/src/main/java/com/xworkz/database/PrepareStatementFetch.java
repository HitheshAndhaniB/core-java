package com.xworkz.database;

import java.sql.*;

public class PrepareStatementFetch {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/Application";
        String userName = "root";
        String password = "Xworkzodc@123";
        String query = "Select * from bank where name = ? and branch = ? ";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
             connection = DriverManager.getConnection(jdbcUrl, userName, password);
             preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "unian");
            preparedStatement.setString(2, "Banasankri");
             resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("---------Fetch bank details---------");
                System.out.println("Bank name----" + resultSet.getString("name"));
                System.out.println("Branch name---" + resultSet.getString("branch"));
            }
            } catch(SQLException e){
                throw new RuntimeException(e);
            }finally {
            if (connection != null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
