package com.zelenin.labs.lab_4_Decorator;

import java.util.Collection;
import java.util.LinkedList;

public class FlowerBucket extends Item {

    private Collection<Flower> bucket;

    public FlowerBucket() {
        this.bucket = new LinkedList<>();
    }

    public String getDescription() {
        return new String("Flower Bucket");
    }

    public double price() {

        double result = 0.0;

        for(Flower f : bucket) {
            result += f.price;
        }

        return result;
    }
}