package com.zelenin.labs.lab_2_OOP;

import java.math.BigDecimal;
import java.time.Month;
import java.time.LocalDate;
/**
 * Created by user on 8/10/2017.
 */
public class FlowerShop {

}

abstract class BouquetItem {

    private static int counter = 0;
    public final int UID = counter++;

    private BigDecimal price;
    private boolean isFree;

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

}


