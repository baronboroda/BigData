package com.zelenin.labs.lab_4_Decorator;

public class PaperDecorator extends ItemDecorator {

    Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    public double price() {
        return 13 + item.price();
    }

    public String getDescription() {
        return new String ("Paper Decorator");
    }

}
