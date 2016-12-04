package org.home.encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Invoice {

    private String client;
    private double value;
    private List<Payment> payments;
    private boolean paid;

    public Invoice(String client, double value) {
        this.client = client;
        this.value = value;
        this.payments = new ArrayList<Payment>();
        this.paid = false;
    }

    public String getClient() {
        return client;
    }

    public double getValue() {
        return value;
    }

    public List<Payment> getPayments() {
        return Collections.unmodifiableList(payments);
    }

    public boolean isPaid() {
        return paid;
    }

    public void addPayments(Payment payment) {
        this.payments.add(payment);
        if(totalOfPayments() > this.value){
            this.paid = true;
        }
    }

    private double totalOfPayments() {
        double total=0;
        for (Payment p : payments){
            total += p.getValue();
        }
        return total;
    }
}