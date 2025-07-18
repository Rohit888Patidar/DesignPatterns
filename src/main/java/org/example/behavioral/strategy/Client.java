package org.example.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new CreditPay();
        paymentMethod.pay();
        paymentMethod = new UPIPay();
        paymentMethod.pay();
    }
}
