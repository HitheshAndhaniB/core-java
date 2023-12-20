package com.xworkz.task;

public class TicketBookingImpl implements TicketBooking{
    @Override
    public double buy(int quantity) {
        System.out.println("Buy movie ticket in TicketBooking App");
        double ticketPrice = 150.0;
        return ticketPrice * quantity;
    }

    @Override
    public boolean cancel() {
        System.out.println("Cancel a movie ticket in TicketBooking App");
        return true;
    }
}
