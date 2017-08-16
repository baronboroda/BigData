package com.zelenin.labs.lab_4_Decorator;

import java.util.LinkedList;

public class Order {

    private LinkedList<Item> items;
    private IPayment payment;
    private IDelivery delivery;

    public void setPaymentStrategy(IPayment payment) {
        this. payment = payment;
    }

    public void setDeliveryStrategy(IDelivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double result = 0.0;

        for(Item i : items) {
            result += i.price();
        }

        return result;
    }

    public void processOrder() {
        this.payment.pay(this.calculateTotalPrice());
        this.delivery.deliver(this.items);
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

}
