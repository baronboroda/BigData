package com.zelenin.labs.lab_4_Decorator;

public class RibbonDecorator extends ItemDecorator {

    private Item item;

    public RibbonDecorator(Item item) {
        super(item);
    }

    public double price() {
        return 40 + item.price();
    }

    public String getDescription() {
        return new String ("Ribbon Decorator");
    }
}
