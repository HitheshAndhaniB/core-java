package com.xworkz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDelete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/Student";
        String userName = "root";
        String password = "Xworkzodc@123";
        String deleteQuery = "delete from Student where id = 101";
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            statement = connection.createStatement();
            int result = statement.executeUpdate(deleteQuery);
            System.out.println(result);
            System.out.println("Deleted a record from bank");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException();
            }try{
                statement.close();
            }catch (SQLException e){
                throw new RuntimeException();
            }
        }
    }
}
