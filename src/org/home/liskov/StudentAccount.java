package org.home.liskov;

public class StudentAccount extends SimpleAccount {
    private int miles;

    public void deposita(double value) {
        super.deposit(value);
        this.miles += (int)value;
    }

    public int getMiles() {
        return miles;
    }

    @Override
    public void payMore() {
        throw new RuntimeException("do not pay more");
    }
}
