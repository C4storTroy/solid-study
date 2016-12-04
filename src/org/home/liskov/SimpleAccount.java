package org.home.liskov;

public class SimpleAccount {



    private ChangeBalance changeBalance;



    public SimpleAccount() {
        this.changeBalance =  new ChangeBalance();
    }


    public void draw(double value){
        changeBalance.draw(value);
    }

    public void deposit(double value){
        changeBalance.deposit(value);
    }

    public void payMore() {
        this.changeBalance.payMore(1.1);
    }


}
