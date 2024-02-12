package com.xworkz.database.repository;

import com.xworkz.database.dto.FlightBooking;

import java.util.List;

public interface FlightBookingRepository {
    public void saveFlightBookingDetails(FlightBooking booking);

    public void findByname();

    public FlightBooking findMyname(String flightName);

    void findByname(String flightName);

    public List<FlightBooking> findAll();
}
