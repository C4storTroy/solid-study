package org.home.usinginterfaces;

public class InvoiceDAO implements ActionAfterGenerateInvoice {

    @Override
    public void execute(InvoiceFinal inf) {
        System.out.println("save inf on database");
    }
}
