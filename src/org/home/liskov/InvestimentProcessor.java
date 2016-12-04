package org.home.liskov;

import java.util.Arrays;
import java.util.List;

public class InvestimentProcessor {


    public static void main(String[] args) {

        for (SimpleAccount conta : bankAccounts()) {
            conta.payMore();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getBalance());
        }
    }

    private static List<SimpleAccount> bankAccounts() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150), studentAccountWith(200));
    }

    private static SimpleAccount studentAccountWith(double amount) {
        StudentAccount c = new StudentAccount();
        c.deposit(amount);
        return c;
    }

    private static SimpleAccount umaContaCom(double valor) {
        SimpleAccount c = new SimpleAccount();
        c.deposit(valor);
        return c;
    }

}
