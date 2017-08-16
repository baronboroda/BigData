package com.zelenin.labs.lab_4_Decorator;

public class FlowerSpec {

    protected FlowerColor color;
    protected double length;
    protected FlowerType type;

    public FlowerSpec(FlowerColor color, double length, FlowerType type) {
        this.color = color;
        this.length = length;
        this.type = type;
    }

    public FlowerType getType() {
        return type;
    }
    public double getLength() {
        return length;
    }
    public FlowerColor getColor() {
        return color;
    }

    public  boolean matches(FlowerSpec otherSpec){

        if (color != otherSpec.getColor())return false;
        if (length != otherSpec.getLength())return false;
        if (type != otherSpec.getType())return false;

        return true;
    }
}