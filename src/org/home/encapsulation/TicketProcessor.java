package org.home.encapsulation;

import java.util.List;

public class TicketProcessor {
    public void processa(List<Ticket> tickets, Invoice invoice) {


        for(Ticket ticket : tickets) {
            Payment payment = new Payment(ticket.getValue(), WayToPay.TICKET);
            invoice.addPayments(payment);


        }

    }
}
