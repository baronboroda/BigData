package com.zelenin.labs.lab_4_Decorator;

public class BasketDecorator extends ItemDecorator {

    private Item item;

    public BasketDecorator(Item item) {
        super(item);
    }

    public double price() {
        return 4 + item.price();
    }

    public String getDescription() {
        return new String ("Paper Decorator");
    }
}
