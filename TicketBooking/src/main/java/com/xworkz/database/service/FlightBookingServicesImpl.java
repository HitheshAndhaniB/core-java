package com.xworkz.database.service;

import com.xworkz.database.dto.FlightBooking;

import java.util.List;

public class FlightBookingServicesImpl {
    public List<FlightBooking> findAll(){
        FlightBookingServicesImpl flightBookingRepository;
        List<FlightBooking> flightBookings = flightBookingRepository.findAll();
        return flightBookings;
        
    }
}
