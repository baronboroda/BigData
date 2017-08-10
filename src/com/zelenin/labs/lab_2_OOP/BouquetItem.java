package com.zelenin.labs.lab_2_OOP;

import java.math.BigDecimal;
import java.time.LocalDate;

abstract class BouquetItem {

    private static int counter = 0;
    public final int ID = counter++;

    protected String name;
    protected BigDecimal price;
    private boolean isFree = true;

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }

    public boolean getIsFree() {
        return this.isFree;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

    public String toString() {
        return this.getClass().getSimpleName() + " " + this.ID + "_" + this.name;
    }

}

class Flower extends BouquetItem {

    private float stemLength;
    private LocalDate pickedOn;
    private String colour;

    public Flower(String name, String colour, float stemLength, LocalDate pickedOn, BigDecimal price) {
        this.name = name;
        this.colour = colour;
        this.stemLength = stemLength;
        this.pickedOn = pickedOn;
        this.price = price;
    }

    public void setStemLength(float stemLength) { this.stemLength = stemLength; }

    public float getStemLength() {
        return this.stemLength;
    }

    public void setPickedOn(LocalDate pickedOn) {
        this.pickedOn = pickedOn;
    }

    public LocalDate getPickedOn() {
        return this.pickedOn;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    public void cutStem(float section) {
        if(section > this.stemLength) {
            System.out.println("Operation failed. Flower " + this + " is supposed to cut too much.");
        } else if (section <= 0){
            System.out.println("Operation failed. Cutting section must be bigger than zero.");
        } else {
            this.setStemLength(this.getStemLength() - section);
        }
        return;
    }
}

class Cactus extends BouquetItem {

    private Shape shape;
    private boolean isBloommy;
    private float height;

    public Cactus(String name, Shape shape, boolean isBloommy, float height, BigDecimal price) {
        this.name = name;
        this.isBloommy = isBloommy;
        this.height = height;
        this.price = price;
    }

    public void setShape(Shape shape) { this.shape = shape; }

    public Shape getShape() {
        return this.shape;
    }

    public void setIsBloommy(boolean isBloommy) {
        this.isBloommy = isBloommy;
    }

    public boolean getIsBloommy() {
        return this.isBloommy;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return this.height;
    }

    public void stayCool() {
        System.out.println("Amigo " + this + " stays cool!");
    }
}
