package com.zelenin.labs.lab_2_OOP;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.function.Predicate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 8/3/2017.
 */
public abstract class Flower {

    private double length;
    private BigDecimal price;
    private int pickedDaysBefore;

    public Flower(double length, BigDecimal price, int pickedDaysBefore) {
        this.length = length;
        this.price = price;
        this.pickedDaysBefore = pickedDaysBefore;
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

    public void setDays(int pickedDaysBefore) {
        this.pickedDaysBefore = pickedDaysBefore;
    }

    public int getDays() {
        return this.pickedDaysBefore;
    }

    public static void main(String[] args) {

        Bucket b1 = new Bucket();
        Lily lily1 = new Lily(30, BigDecimal.valueOf(15), 2);
        Tulip tulip1 = new Tulip(20, BigDecimal.valueOf(30), 3);
        Lavender lavender1 = new Lavender(40, BigDecimal.valueOf(10), 1);
        b1.addFlower(lily1);
        b1.addFlower(tulip1);
        b1.addFlower(lavender1);

        System.out.println(b1.getLongestFlower());
        System.out.println(b1.totalPrice());
    }

}

 abstract class SpringFlower extends Flower {

    public final static String TYPE_NAME = "Spring";

    public SpringFlower(double length, BigDecimal price, int pickedDaysBefore) {
        super(length, price, pickedDaysBefore);
    }
}
abstract class WeddingFlower extends Flower {

    public final static String TYPE_NAME = "Wedding";

    public WeddingFlower(double length, BigDecimal price, int pickedDaysBefore) {
        super(length, price, pickedDaysBefore);
    }
}

abstract class TropicalFlower extends Flower {

    public final static String TYPE_NAME = "Tropical";

    public TropicalFlower(double length, BigDecimal price, int pickedDaysBefore) {
        super(length, price, pickedDaysBefore);
    }
}

class Peony extends SpringFlower {

    public final static String NAME = "Peony";

    public Peony (double length, BigDecimal price, int pickedDaysBefore) {
        super(length, price, pickedDaysBefore);
    }
}

class Tulip extends SpringFlower {

    public final static String NAME = "Tulip";

    public Tulip (double length, BigDecimal price, int pickedDaysBefore) {
        super(length, price, pickedDaysBefore);
    }
}

class Waxflower extends SpringFlower {

    public final static String NAME = "Waxflower";

    public Waxflower (double length, BigDecimal price, int pickedDaysBefore) {
        super(length, price, pickedDaysBefore);
    }
}

class Iris extends WeddingFlower {

    public final static String NAME = "Iris";

    public Iris (double length, BigDecimal price, int pickedDaysBefore) {
        super(length, price, pickedDaysBefore);
    }
}

class Lavender extends WeddingFlower {

    public final static String NAME = "Lavender";

    public Lavender (double length, BigDecimal price, int pickedDaysBefore) {
        super(length, price, pickedDaysBefore);
    }
}

class Lily extends WeddingFlower {

    public final static String NAME = "Lily";

    public Lily (double length, BigDecimal price, int pickedDaysBefore) {
        super(length, price, pickedDaysBefore);
    }
}

class Orchid extends TropicalFlower {

    public final static String NAME = "Orchid";

    public Orchid (double length, BigDecimal price, int pickedDaysBefore) {
        super(length, price, pickedDaysBefore);
    }
}

class Heliconia extends TropicalFlower {

    public final static String NAME = "Heliconia";

    public Heliconia (double length, BigDecimal price, int pickedDaysBefore) {
        super(length, price, pickedDaysBefore);
    }
}

class Ginger extends TropicalFlower {

    public final static String NAME = "Ginger";

    public Ginger (double length, BigDecimal price, int pickedDaysBefore) {
        super(length, price, pickedDaysBefore);
    }
}

class Bucket {

    private Collection<Flower> flowers;
    private double freshness;


    public Bucket() {
        this.flowers = new ArrayList<>();
        this.freshness = 0.0;
    }

    public void addFlower (Flower flower) {
        flowers.add(flower);
        freshness += flower.getDays() / flowers.size();
    }

    /*public void addFlowers(Bucket bucket) {
        this.flowers.addAll(bucket.flowers);
    }*/

    public boolean removeFlower(Flower flower) {
        if (flowers.isEmpty()) {
            System.out.println("The bucket is empty.");
            return false;
        } else if (!flowers.contains(flower)) {
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

    /*public long getDateDiff(Date date1, Date date2) {

        long diffInMillies = date2.getTime() - date1.getTime();
        return TimeUnit.MILLISECONDS.convert(diffInMillies,TimeUnit.MILLISECONDS);

    }*/
}