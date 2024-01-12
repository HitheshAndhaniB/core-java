package com.xworkz.task;

public interface TicketBooking {
    String ticketType ="MovieTicket";
    int maxTicket = 10;

    double buy(int quantity);

    boolean cancel();
}
