package com.zelenin.labs.lab_4_Decorator;

public class BasketDecorator extends ItemDecorator {

    private Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    public double price() {
        return 4 + item.price();
    }

    public String getDescription() {
        return new String ("Paper Decorator");
    }
}
