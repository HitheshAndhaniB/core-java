package com.xworkz.task.boot;

import com.xworkz.task.Theater;
import com.xworkz.task.TicketBooking;
import com.xworkz.task.TicketBookingImpl;

public class TheaterRunner {
    public static void main(String[] args) {
        TicketBooking ticketBooking=new TicketBookingImpl();
        ticketBooking.cancel();
        Theater theater = new Theater();
        theater.cancel(0);
        theater.sell(5);
        double totalCost = theater.sell(3);
        System.out.println("Total cost for 3 tickets"+totalCost);

        double totalCost1 = theater.sell(5);
        System.out.println("Total cost for 5 tickets"+totalCost1);

        double totalCost3 = theater.sell(6);
        System.out.println("Total cost for 6 tickets"+totalCost3);

        double totalCost4 = theater.sell(7);
        System.out.println("Total cost for 7 tickets"+totalCost4);
    }
}
