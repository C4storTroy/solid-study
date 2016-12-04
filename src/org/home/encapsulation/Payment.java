package org.home.encapsulation;

public class Payment {
    private double value;
    private WayToPay wayToPay;

    public Payment(double value, WayToPay wayToPay) {
        this.value = value;
        this.wayToPay = wayToPay;
    }

    public double getValue() {
        return value;
    }

    public WayToPay getWayToPay() {
        return wayToPay;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Payment)) {
            return false;
        }
        Payment outro = (Payment) obj;
        if (wayToPay != outro.wayToPay
                || Double.doubleToLongBits(value) != Double
                .doubleToLongBits(outro.value)) {
            return false;
        }

        return true;
    }
}
