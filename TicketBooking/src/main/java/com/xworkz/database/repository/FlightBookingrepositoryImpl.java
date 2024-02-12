package com.xworkz.database.repository;

import com.xworkz.database.dto.FlightBooking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightBookingrepositoryImpl implements FlightBookingRepository{
    @Override
    public void saveFlightBookingDetails(FlightBooking booking) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/TicketSystem";
        String userName = "root";
        String password = "Xworkzodc@123";
        String insertQuery = "insert into AirTicket (flight_name,sources,destination,price)values(?,?,?,?)";

        try {
           Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1,booking.getFlightName());
            preparedStatement.setString(2,booking.getSources());
            preparedStatement.setString(3,booking.getDestination());
            preparedStatement.setInt(4,booking.getPrice());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void findByname() {

    }

    @Override
    public FlightBooking findMyname(String flightName) {
        return null;
    }

    @Override
    public void findByname(String flightName) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/TicketSystem";
        String userName = "root";
        String password = "Xworkzodc@123";
        String insertQuery = "Select * from airticket where name = ?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1,flightName);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                System.out.println(resultSet.getString("source"));
                System.out.println(resultSet.getString("destination"));
                FlightBooking booking = new FlightBooking();
                booking.setFlightName(resultSet.getString("FligthName"));
                booking.setDestination(resultSet.getString("destination"));
                booking.setPrice(resultSet.getInt("price"));
                booking.setSources(resultSet.getString("source"));
            }
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<FlightBooking> findAll() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
            String jdbcUrl = "jdbc:mysql://localhost:3306/TicketSystem";
            String userName = "root";
            String password = "Xworkzodc@123";
            String Query = "Select * from airticket ";
        List<FlightBooking> bookings = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement = connection.prepareStatement(Query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString("source"));
                FlightBooking booking = new FlightBooking();
                booking.setFlightName(resultSet.getString("Flight_name"));
                booking.setSources(resultSet.getString("Source"));
                booking.setDestination(resultSet.getString("destination"));
                booking.setPrice(resultSet.getInt("price"));
                booking.add(booking);
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        return null;
    }

}

