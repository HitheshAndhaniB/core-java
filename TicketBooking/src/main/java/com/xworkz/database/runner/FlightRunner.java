package com.xworkz.database.runner;

import com.xworkz.database.dto.FlightBooking;
import com.xworkz.database.repository.FlightBookingRepository;
import com.xworkz.database.repository.FlightBookingrepositoryImpl;
import com.xworkz.database.service.FlightBookingServices;

import java.util.ArrayList;
import java.util.List;

public class FlightRunner {
    public static void main(String[] args) {
        FlightBookingRepository flightBookingRepository = new FlightBookingrepositoryImpl();
        FlightBooking flightBooking = new FlightBooking("banglor","AirIndigo","Goa",5000);
        flightBookingRepository.saveFlightBookingDetails(flightBooking);


        List<FlightBooking> list = new ArrayList<>();
        FlightBooking flightBooking1= new FlightBooking("banglore","airindigo","mumbai",8000);
        list.add(flightBooking1);
FlightBookingServices flightBookingServices = new FlightBookingrepositoryImpl();
        List<FlightBooking> list1=flightBookingService.findAll();
        System.out.println(("FlightBooking details"));
        list1.forEach(booking -> {
            System.out.println(booking.getFlightName());
            System.out.println(booking.getSources());
            System.out.println(booking.getDestination());
            System.out.println(booking.getPrice());

        });

    }
}
