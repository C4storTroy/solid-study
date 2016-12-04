package org.home.usinginterfaces;

import java.util.List;

public class InvoiceGenerator {

    private List<ActionAfterGenerateInvoice> actions;

    public InvoiceGenerator(List<ActionAfterGenerateInvoice> actions) {
        this.actions = actions;
    }

    public InvoiceFinal gera(Invoice invoice) {

        double valor = invoice.getValueMonthly();

        InvoiceFinal inf = new InvoiceFinal(valor, simpleTaxOver(valor));

        for(ActionAfterGenerateInvoice action: actions){
            action.execute(inf);
        }

        return inf;
    }

    private double simpleTaxOver(double valor) {
        return valor * 0.06;
    }

}
