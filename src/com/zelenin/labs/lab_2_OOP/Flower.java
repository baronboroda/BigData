package com.zelenin.labs.lab_2_OOP;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.function.Predicate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by user on 8/3/2017.
 */
public abstract class Flower {

    private double length;
    private BigDecimal price;
    private Date pickedDate;

    public Flower(double length, BigDecimal price, Date pickedDate) {
        this. length = length;
        this.price = price;
        this.pickedDate = pickedDate;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setDays(Date pickedDate) {
        this.pickedDate = pickedDate;
    }

    public Date getDays() {
        return this.pickedDate;
    }

    public static void main(String[] args) {

        ArrayList<Flower> bucket = new ArrayList();

        //LocalDateTime.now();

        System.out.println( LocalDateTime.now());

    }

}

 abstract class SpringFlower extends Flower {

    public final static String TYPE_NAME = "Spring";

    public SpringFlower(double length, BigDecimal price, Date pickedDate) {
        super(length, price, pickedDate);
    }
}
abstract class WeddingFlower extends Flower {

    public final static String TYPE_NAME = "Wedding";

    public WeddingFlower(double length, BigDecimal price, Date pickedDate) {
        super(length, price, pickedDate);
    }
}

abstract class TropicalFlower extends Flower {

    public final static String TYPE_NAME = "Tropical";

    public TropicalFlower(double length, BigDecimal price, Date pickedDate) {
        super(length, price, pickedDate);
    }
}

class Peony extends SpringFlower {

    public final static String NAME = "Peony";

    public Peony (double length, BigDecimal price, Date pickedDate) {
        super(length, price, pickedDate);
    }
}

class Tulip extends SpringFlower {

    public final static String NAME = "Tulip";

    public Tulip (double length, BigDecimal price, Date pickedDate) {
        super(length, price, pickedDate);
    }
}

class Waxflower extends SpringFlower {

    public final static String NAME = "Waxflower";

    public Waxflower (double length, BigDecimal price, Date pickedDate) {
        super(length, price, pickedDate);
    }
}

class Iris extends WeddingFlower {

    public final static String NAME = "Iris";

    public Iris (double length, BigDecimal price, Date pickedDate) {
        super(length, price, pickedDate);
    }
}

class Lavender extends WeddingFlower {

    public final static String NAME = "Lavender";

    public Lavender (double length, BigDecimal price, Date pickedDate) {
        super(length, price, pickedDate);
    }
}

class Lily extends WeddingFlower {

    public final static String NAME = "Lily";

    public Lily (double length, BigDecimal price, Date pickedDate) {
        super(length, price, pickedDate);
    }
}

class Orchid extends TropicalFlower {

    public final static String NAME = "Orchid";

    public Orchid (double length, BigDecimal price, Date pickedDate) {
        super(length, price, pickedDate);
    }
}

class Heliconia extends TropicalFlower {

    public final static String NAME = "Heliconia";

    public Heliconia (double length, BigDecimal price, Date pickedDate) {
        super(length, price, pickedDate);
    }
}

class Ginger extends TropicalFlower {

    public final static String NAME = "Ginger";

    public Ginger (double length, BigDecimal price, Date pickedDate) {
        super(length, price, pickedDate);
    }
}

class Bucket {

    private Collection<Flower> flowers;

    public Bucket() {}

    public void addFlower (Flower flower) {
        this.flowers.add(flower);
    }

    public void addFlowers(Bucket bucket) {
        this.flowers.addAll(bucket.flowers);
    }

    public boolean removeFlower(Flower flower) {
        if (!flowers.contains(flower)) {
            return false;
        } else {
            flowers.remove(flower);
            return true;
        }
    }

    public BigDecimal totalPrice() {

        BigDecimal totalPrice = BigDecimal.ZERO;

        if (this.flowers.isEmpty()) {
            return BigDecimal.ZERO;
        } else {
            for (Flower f : this.flowers) {
                totalPrice = totalPrice.add(f.getPrice());
            }
        }

        return totalPrice;
    }

    public Flower getLongestFlower() {

        double length = 0.0d;
        Flower longestFlower = null;

        if (this.flowers.isEmpty()) {
            System.out.println("Bucket is empty.");
            return null;
        } else {
            for (Flower f : this.flowers) {
                if(length < f.getLength()) {
                    length = f.getLength();
                    longestFlower = f;
                }
            }
        }
        return longestFlower;
    }
}

