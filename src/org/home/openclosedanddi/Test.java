package org.home.openclosedanddi;

public class Test {



    public static void main(String[] args) {


        // now polymorphism is working doesn't matter what table price
        // you are using our calcprice still working

        TablePrice table = new DefaultPriceTable();
        //        TablePrice table = new PriceTableDiff();
        DeliveryService deliver = new Freight();

        CalcPrice calc = new CalcPrice(table, deliver);
    }

}
