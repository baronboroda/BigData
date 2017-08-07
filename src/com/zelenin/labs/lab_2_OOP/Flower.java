package com.zelenin.labs.lab_2_OOP;

import java.math.BigDecimal;
import java.time.Month;
import java.time.LocalDate;

/**
 * Created by user on 8/3/2017.
 */
public abstract class Flower {

    private float length;
    private BigDecimal price;
    private LocalDate pickedOn;
    private boolean isFree = true;

    public Flower(float length, BigDecimal price, LocalDate pickedOn) {
        this.length = length;
        this.price = price;
        this.pickedOn = pickedOn;
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

    public void setPickedOn(LocalDate pickedOn) {
        this.pickedOn = pickedOn;
    }

    public LocalDate getPickedOnOn() {
        return this.pickedOn;
    }

    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }

    public boolean getIsFree() {
        return this.isFree;
    }

    public static void main(String[] args) {

        Ginger g1 = new Ginger(30, BigDecimal.valueOf(30.0), LocalDate.of(2017, Month.AUGUST, 1));
        Heliconia h1 = new Heliconia(35, BigDecimal.valueOf(45.0), LocalDate.of(2017, Month.JULY, 30));
        Iris i1 = new Iris(40, BigDecimal.valueOf(20), LocalDate.of(2017, Month.JULY, 31));
        Lavender lav1 = new Lavender(45, BigDecimal.valueOf(30.0), LocalDate.of(2017, Month.AUGUST, 1));
        Lily lil1 = new Lily(15, BigDecimal.valueOf(50.0), LocalDate.of(2017, Month.JULY, 29));
        Orchid o1 = new Orchid(20, BigDecimal.valueOf(60.0), LocalDate.of(2017, Month.JULY, 20));
        Peony p1 = new Peony(25, BigDecimal.valueOf(25.0), LocalDate.of(2017, Month.AUGUST, 5));
        Tulip t1 = new Tulip(30, BigDecimal.valueOf(15.0), LocalDate.of(2017, Month.AUGUST, 7));
        Waxflower w1 = new Waxflower(40, BigDecimal.valueOf(40.0), LocalDate.of(2017, Month.AUGUST, 1));

        Bouquet b1 = new Bouquet(g1, h1, i1);
        Bouquet b2 = new Bouquet(lav1, lil1, o1);
        Bouquet b3 = new Bouquet(p1, t1, w1);

        System.out.println("--------------Result---------------");
        Flower longestFlower;
        System.out.println("Bouquet_1: ");
        longestFlower = b1.getLongestFlower();
        System.out.println("Longest flower is " + longestFlower + " with length " + longestFlower.getLength());
        System.out.println("Total price is " + b1.getTotalPrice());
        System.out.println("-----------------------------------");
        System.out.println("Bouquet_2: ");
        longestFlower = b2.getLongestFlower();
        System.out.println("Longest flower is " + longestFlower + " with length " + longestFlower.getLength());
        System.out.println("Total price is " + b2.getTotalPrice());
        System.out.println("-----------------------------------");
        longestFlower = b3.getLongestFlower();
        System.out.println("Bouquet_3: ");
        System.out.println("Longest flower is " + longestFlower+ " with length " +longestFlower.getLength());
        System.out.println("Total price is " + b3.getTotalPrice());

        System.out.println("-------Most freshness bouquet------");
        Bouquet mostFresh = getMostFresh(b1, b2, b3);
        System.out.println("Most freshness bouquet is bouquet " + mostFresh + " with average freshness " + mostFresh.getFreshness() + " days.");

    }

    public static Bouquet getMostFresh(Bouquet... bouquet) {
        long maxFresh = Long.MAX_VALUE;
        Bouquet mostFresh = null;

        for(Bouquet b : bouquet) {
            if(maxFresh > b.getFreshness()) {
                maxFresh  = b.getFreshness();
                mostFresh = b;
            }
        }
        return mostFresh;
    }

}

abstract class SpringFlower extends Flower {

    public final static String TYPE_NAME = "Spring";

    public SpringFlower(float length, BigDecimal price, LocalDate pickedOn) {
        super(length, price, pickedOn);
    }
}

abstract class WeddingFlower extends Flower {

    public final static String TYPE_NAME = "Wedding";

    public WeddingFlower(float length, BigDecimal price, LocalDate pickedOn) {
        super(length, price, pickedOn);
    }
}

abstract class TropicalFlower extends Flower {

    public final static String TYPE_NAME = "Tropical";

    public TropicalFlower(float length, BigDecimal price, LocalDate pickedOn) {
        super(length, price, pickedOn);
    }
}

class Peony extends SpringFlower {
    private static int counter = 0;
    public final int UID = counter++;

    public final static String NAME = "Peony";

    public Peony (float length, BigDecimal price, LocalDate pickedOn) {
        super(length, price, pickedOn);
    }

    public String toString() {
        return new String(NAME + "_" + UID);
    }
}

class Tulip extends SpringFlower {
    private static int counter = 0;
    public final int UID = counter++;

    public final static String NAME = "Tulip";

    public Tulip (float length, BigDecimal price, LocalDate pickedOn) {
        super(length, price, pickedOn);
    }

    public String toString() {
        return new String(NAME + "_" + UID);
    }
}

class Waxflower extends SpringFlower {
    private static int counter = 0;
    public final int UID = counter++;

    public final static String NAME = "Waxflower";

    public Waxflower (float length, BigDecimal price, LocalDate pickedOn) {
        super(length, price, pickedOn);
    }

    public String toString() {
        return new String(NAME + "_" + UID);
    }
}

class Iris extends WeddingFlower {
    private static int counter = 0;
    public final int UID = counter++;

    public final static String NAME = "Iris";

    public Iris (float length, BigDecimal price, LocalDate pickedOn) {
        super(length, price, pickedOn);
    }

    public String toString() {
        return new String(NAME + "_" + UID);
    }
}

class Lavender extends WeddingFlower {
    private static int counter = 0;
    public final int UID = counter++;

    public final static String NAME = "Lavender";

    public Lavender (float length, BigDecimal price, LocalDate pickedOn) {
        super(length, price, pickedOn);
    }

    public String toString() {
        return new String(NAME + "_" + UID);
    }

}

class Lily extends WeddingFlower {
    private static int counter = 0;
    public final int UID = counter++;

    public final static String NAME = "Lily";

    public Lily (float length, BigDecimal price, LocalDate pickedOn) {
        super(length, price, pickedOn);
    }

    public String toString() {
        return new String(NAME + "_" + UID);
    }
}

class Orchid extends TropicalFlower {
    private static int counter = 0;
    public final int UID = counter++;

    public final static String NAME = "Orchid";

    public Orchid (float length, BigDecimal price, LocalDate pickedOn) {
        super(length, price, pickedOn);
    }
    public String toString() {
        return new String(NAME + "_" + UID);
    }

}

class Heliconia extends TropicalFlower {
    private static int counter = 0;
    public final int UID = counter++;

    public final static String NAME = "Heliconia";

    public Heliconia (float length, BigDecimal price, LocalDate pickedOn) {
        super(length, price, pickedOn);
    }

    public String toString() {
        return new String(NAME + "_" + UID);
    }
}

class Ginger extends TropicalFlower {
    private static int counter = 0;
    public final int UID = counter++;

    public final static String NAME = "Ginger";

    public Ginger (float length, BigDecimal price, LocalDate pickedOn) {
        super(length, price, pickedOn);
    }

    public String toString() {
        return new String(NAME + "_" + UID);
    }
}

