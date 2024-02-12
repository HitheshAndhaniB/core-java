package com.xworkz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankDetails {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/Application";
        String userName = "root";
        String password = "Xworkzodc@123";
        String insertQuery = "insert into bank values(01,'sbi','btn','sbim004012','banglore'),(2,'sbi','rajaji','sbim004010','Banglore'),(3,'Hdfc','Gandinagar','hdfc001203','Mysore'),(4,'hdfc','Indiranagar','hdfc001021','Mysore'),(5,'Canara','KR puram','can001234','Banglore'),(6,'Canara','jayanagar','can001035','Banglore'),(7,'unian','Banasankri','uni001026','banglore')";
        try {
            Connection connection= DriverManager.getConnection(jdbcUrl, userName, password);
            Statement statement = connection.createStatement();
            boolean result = statement.execute(insertQuery);
            System.out.println(result);
            System.out.println("inserted data into bank");
            System.out.println("connection to database is sucessfull!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
