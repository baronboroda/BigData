package com.zelenin.labs.lab_4_Decorator;

public class PaperDecorator extends ItemDecorator{

    private Item item;

    public PaperDecorator(Item item) {
        super(item);
    }

    public double price() {
        return 13 + item.price();
    }

    public String getDescription() {
        return new String ("Paper Decorator");
    }

}
