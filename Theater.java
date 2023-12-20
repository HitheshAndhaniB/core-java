package com.xworkz.task;

public class Theater {
    TicketBooking ticketBooking=new TicketBookingImpl();
    public double sell(int quantity) {
        double totalCost = 0.0;
        double ticketPrice = ticketBooking.buy(quantity);
        if (quantity > 5) {
            double discount;
            discount = ticketPrice*0.10;
            totalCost = ticketPrice-discount;
            System.out.println("Calculate discount for ticketprice");
        } else {
            totalCost = ticketPrice;
            System.out.println("totalcost of ticket");
        }
        return totalCost;
    }
    public void cancel(int quantity){
        boolean cancelTicket= ticketBooking.cancel();
        if(cancelTicket && quantity<1){
            System.out.println("ticket as been canceld :"+cancelTicket);
        }
        else{
            System.out.println("ticket can not cancel");

        }
    }
}
