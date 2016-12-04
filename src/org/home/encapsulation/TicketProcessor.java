package org.home.encapsulation;

import java.util.List;

public class TicketProcessor {
    public void processa(List<Ticket> tickets, Invoice invoice) {

        double total = 0;
        for(Ticket ticket : tickets) {
            Payment payment = new Payment(ticket.getValue(), WayToPay.BOLETO);
            invoice.getPayments().add(payment);

            total += ticket.getValue();
        }

        if(total >= invoice.getValue()) {
            invoice.setPaid(true);
        }
    }
}
