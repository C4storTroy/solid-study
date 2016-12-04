package org.home.openclosedanddi;

public class CalcPrice {

    public double calcula(Purchase product) {
        DefaultPriceTable table = new DefaultPriceTable();
        Freight post = new Freight();

        double discount = table.discountTo(product.getValue());
        double freight = post.deliverTo(product.getCity());

        return product.getValue() * (1-discount) + freight;
    }

}
