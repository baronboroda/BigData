package com.zelenin.labs.lab_2_OOP;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.lang.Exception;

public class Bouquet {

    private static int counter = 0;
    public final int UID = counter++;

    private Collection <BouquetItem> items = new ArrayList<>();

    public Bouquet() {}

    public void addItems(BouquetItem... items) {
        for (BouquetItem bi : items) {
            if(bi.getIsFree() == true) {
                this.items.add(bi);
                bi.setIsFree(false);
            } else {
                System.out.println("Oops! " + bi + " already exists in the bouquet");
            }
        }
    }

    public void getLongestFlower() throws BouquetException {

        double maxLength = 0.0d;
        Flower longestFlower = null;

        for (BouquetItem bi : this.items) {
            if(bi instanceof Flower) {
                Flower f = (Flower)bi;
                if (maxLength < f.getStemLength()) {
                    maxLength = f.getStemLength();
                    longestFlower = f;
                }
            }
        }
        if(longestFlower == null) {
            System.out.println(this + " has no flowers.");
        }
        System.out.println("The longest flower in " + this + " is " + );
    }

    public BigDecimal getTotalPrice() {

        BigDecimal totalPrice = BigDecimal.ZERO;

        for (BouquetItem bi : this.items) {
            totalPrice = totalPrice.add(bi.getPrice());
        }
        return totalPrice;

    }

    public double getFreshness() throws BouquetException {

        double totalFreshness = 0.0d;
        int flowersQuantity = 0;

        for (BouquetItem bi : this.items) {
            if(bi instanceof Flower) {
                Flower f = (Flower)bi;
                totalFreshness += (double) ChronoUnit.DAYS.between(f.getPickedOn(), LocalDate.now());
                flowersQuantity++;
            }
        }
        if(flowersQuantity == 0) {
            throw new BouquetException("Bouquet has no flowers.");
        }
        return totalFreshness / flowersQuantity;
    }

    public void findFlowersByName(String name) {

        Collection<Flower> result = new ArrayList<>();

        for (BouquetItem bi : this.items) {
            if(bi instanceof Flower) {
                Flower f = (Flower)bi;
                if(this.items.contains(f) && f.getName() == name) {
                    result.add(f);
                }
            }
        }

        System.out.println("Search result");
        if(result.isEmpty()) {
            System.out.println("There are no flowers " + name + " in the " + this);
        } else {
            System.out.println(this + " contains " + result.size() + " " + name + "(s): ");
            for (Flower f : result) {
                System.out.println(f);
            }
        }
    }

    private void checkBouquet() {
        try {
            if (this.items.isEmpty() || this.items == null) {
                throw new BouquetException("Bouquet is empty or doesn't exists.");
            }
        } catch(BouquetException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return new String("Bouquet_" + UID);
    }
}

class BouquetException extends Exception {
    public BouquetException(String message) {
        super(message);
    }
}
