package com.zelenin.labs.lab_4_Decorator;

public class CreditCardPaymentStrategy implements IPayment {

    public void pay(double price) {
        System.out.println("Payed successfully by credit cards");
    }
}
