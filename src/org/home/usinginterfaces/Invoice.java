package org.home.usinginterfaces;

public class Invoice {
    private double valueMonthly;
    private String client;

    public Invoice() {}

    public Invoice(double valueMonthly, String client) {
        this.valueMonthly = valueMonthly;
        this.client = client;
    }
    public double getValueMonthly() {
        return valueMonthly;
    }
    public void setValorMensal(double valueMonthly) {
        this.valueMonthly = valueMonthly;
    }
    public String getClient() {
        return client;
    }
    public void setClient(String client) {
        this.client = client;
    }
}
