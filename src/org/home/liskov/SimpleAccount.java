package org.home.liskov;

public class SimpleAccount {
    protected double balance;

    public SimpleAccount() {
        this.balance = 0;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void draw(double value) {
        if (value <= this.balance) {
            this.balance -= value;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void payMore() {
        this.balance += this.balance * 0.01;
    }

    public double getBalance() {
        return balance;
    }
}
