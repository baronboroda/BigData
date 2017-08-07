package com.zelenin.labs.lab_2_OOP;

import java.math.BigDecimal;
import java.util.Collection;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.lang.Exception;

public class Bouquet {

    private static int counter = 0;
    public final int UID = counter++;

    private Collection <Flower> flowers;

    public Bouquet(Flower... flower) {
        for (Flower f : flower) {
            this.flowers.add(f);
            f.setIsFree(false);
        }
    }

    public Flower getLongestFlower() {
        if (this.flowers.isEmpty() || this.flowers == null) {
           return null;
        } else {
            double maxLength = 0.0d;
            Flower longestFlower = null;

            for (Flower f : this.flowers) {
                if (maxLength < f.getLength()) {
                    maxLength = f.getLength();
                    longestFlower = f;
                }
            }
            return longestFlower;
        }
    }

    public BigDecimal getTotalPrice() {
        if (this.flowers.isEmpty() || this.flowers == null) {
            return BigDecimal.ZERO;
        } else {
            BigDecimal totalPrice = BigDecimal.ZERO;

            for (Flower f : this.flowers) {
                totalPrice = totalPrice.add(f.getPrice());
            }
            return totalPrice;
        }
    }

    public double getFreshness() throws NoBouquetException{
        if (this.flowers.isEmpty() || this.flowers == null) {
            throw new NoBouquetException("The bouquet is empty or doesn't exists.");
        } else {
            double averageFreshness = 0.0;

            for (Flower f : this.flowers) {
                averageFreshness += (double)ChronoUnit.DAYS.between(f.getPickedOn(), LocalDate.now()) / this.flowers.size();
            }
            return averageFreshness;
        }
    }

    private static long getDateDiff(LocalDate start, LocalDate end) {
        return ChronoUnit.DAYS.between(start, end);
    }

    public String toSting() {
        return  new String("Bouquet_" + UID);
    }

    class NoBouquetException extends Exception {
        public NoBouquetException(String message) {
            super(message);
        }
    }

}
