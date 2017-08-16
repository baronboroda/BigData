package com.zelenin.labs.lab_4_Decorator;

public class Flower {

    protected boolean fresh;
    protected double price;
    protected FlowerSpec spec;

    public Flower(  boolean fresh, double price, FlowerSpec spec) {
        this.fresh = fresh;
        this.price = price;
        this.spec = spec;
    }

    public FlowerSpec getSpec(){ return spec; }
    public double getPrice() {
        return price;
    }
    public boolean isFresh() {
        return fresh;
    }

    public String toString() {
        return "Type: " + spec.getType() + " price is " + String.valueOf(getPrice()) + " its color is " + spec.getColor() + " fresh leve is " + String.valueOf(isFresh()) + " its height " + String.valueOf(spec.getLength());
    }

}
