package org.home.openclosedanddi;

public class DefaultPriceTable {

    public double discountTo(double value) {
        if(value>5000) return 0.03;
        if(value>1000) return 0.05;
        return 0;
    }
}
