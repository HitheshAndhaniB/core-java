package com.xworkz.database.dto;

public class FlightBooking {
    private String sources;

    private String flightName;
    private String destination;
    private int price;

    public FlightBooking(String sources, String flightName, String destination, int price) {
        this.sources = sources;
        this.flightName = flightName;
        this.destination = destination;
        this.price = price;
    }

    public FlightBooking() {

    }


    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void add(FlightBooking booking) {
    }
}
