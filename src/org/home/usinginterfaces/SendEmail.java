package org.home.usinginterfaces;

public class SendEmail  implements ActionAfterGenerateInvoice{

    @Override
    public void execute(InvoiceFinal inf) {
        System.out.println("send email from inf " + inf.getId());
    }

}
