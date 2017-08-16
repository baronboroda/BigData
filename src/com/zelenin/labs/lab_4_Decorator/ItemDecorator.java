package com.zelenin.labs.lab_4_Decorator;

public abstract class ItemDecorator extends Item {

    Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    public abstract String getDescription();
}
