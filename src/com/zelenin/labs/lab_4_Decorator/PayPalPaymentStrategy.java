package com.zelenin.labs.lab_4_Decorator;

public class PayPalPaymentStrategy implements IPayment {

    public void pay(double price) {
        System.out.println("Payed successfully by PayPal");
    }
}
