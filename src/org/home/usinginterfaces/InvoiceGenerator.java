package org.home.usinginterfaces;

public class InvoiceGenerator {

    private final SendEmail email;
    private final InvoiceDAO dao;

    public InvoiceGenerator(SendEmail email, InvoiceDAO dao) {
        this.email = email;
        this.dao = dao;
    }

    public InvoiceFinal gera(Invoice invoice) {

        double valor = invoice.getValueMonthly();

        InvoiceFinal inf = new InvoiceFinal(valor, simpleTaxOver(valor));

        email.sendEmail(inf);
        dao.save(inf);

        return inf;
    }

    private double simpleTaxOver(double valor) {
        return valor * 0.06;
    }

}
