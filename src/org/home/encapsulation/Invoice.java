package org.home.encapsulation;

import java.util.ArrayList;
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
        return payments;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }


}