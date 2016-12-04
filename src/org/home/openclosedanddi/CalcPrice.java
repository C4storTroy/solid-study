package org.home.openclosedanddi;

public class CalcPrice {

    private TablePrice table;
    private DeliveryService deliver;

    public CalcPrice(TablePrice table, DeliveryService deliver){
        this.table = table;
        this.deliver = deliver;

    }
    public double calcula(Purchase product) {

        double discount = table.discountTo(product.getValue());
        double freight = deliver.to(product.getCity());

        return product.getValue() * (1-discount) + freight;
    }

}
