package com.xworkz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankApplication {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/Application";
        String userName = "root";
        String password = "Xworkzodc@123";
        String inserQuery = "insert into bank values(1,'sbi','btn','sbim004012','banglore')";

        try {
          Connection connection= DriverManager.getConnection(jdbcUrl, userName, password);
            Statement statement = connection.createStatement();
            boolean result = statement.execute(inserQuery);
            System.out.println(result);
            System.out.println("inserted data into bank");
            System.out.println("connection to database is sucessfull!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
