package com.xworkz.database.Repository;

import com.xworkz.database.Dto.DamInfo;

import java.sql.*;

public class DamrepositoryImpl implements DamRepository {
    @Override
    public void insertInfo(DamInfo damInfo) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/Reservior";
        String user = "root";
        String password = "Xworkzodc@123";
        String query = "insert into dam(id,place,state,height) values(?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Shivmogga");
            preparedStatement.setString(3, "Karnataka");
            preparedStatement.setInt(4, 180);
            preparedStatement.execute();

            System.out.println("inserted successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(int height, String place) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/Reservior";
        String user = "root";
        String password = "Xworkzodc@123";
        String updatequery = "update dam set height = ? where place = ?";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(updatequery);
            preparedStatement.setInt(1, height);
            preparedStatement.setString(2, place);
            preparedStatement.execute();

            System.out.println("Updated successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }

    @Override
    public DamInfo findByName(String place) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/Reservior";
        String user = "root";
        String password = "Xworkzodc@123";
        String updatequery = "select * from dam where place=?";
        DamInfo damInfo = null;
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(updatequery);
            preparedStatement.setString(1, place);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Selected successfully");
                System.out.println(resultSet.getString("Place"));
                damInfo = new DamInfo();
              damInfo.setPlace(resultSet.getString("place"));
                damInfo.setState(resultSet.getString("state"));
                damInfo.setHeight(resultSet.getInt(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return damInfo;
    }
}
