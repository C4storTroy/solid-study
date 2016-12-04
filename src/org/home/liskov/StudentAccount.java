package org.home.liskov;

public class StudentAccount{
    private int miles;

    private ChangeBalance changeBalance;

    public StudentAccount(){
        changeBalance = new ChangeBalance();
    }

    public void deposit(double value) {
        changeBalance.deposit(value);
        this.miles += (int)value;
    }

    public int getMiles() {
        return miles;
    }

    public double getBalance(){
        return changeBalance.getBalance();
    }
}
