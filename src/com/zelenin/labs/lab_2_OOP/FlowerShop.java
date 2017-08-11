package com.zelenin.labs.lab_2_OOP;

import java.math.BigDecimal;
import java.time.Month;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
/**
 * Created by user on 8/10/2017.
 */
public class FlowerShop {
    /**
     * Demonstrates possible FlowerShop's functions
     */
    public static void main(String[] args) {

        /* Let's create some bouquet items */
        Flower f1 = new Flower("Rose", "pink", 50,
                LocalDate.of(2017, Month.AUGUST, 10),
                BigDecimal.valueOf(45.0));
        Flower f2 = new Flower("Lily", "white", 30,
                LocalDate.of(2017, Month.AUGUST, 8),
                BigDecimal.valueOf(50.0));
        Flower f3 = new Flower("Lavender", "blue", 45,
                LocalDate.of(2017, Month.JULY, 14),
                BigDecimal.valueOf(10.0));
        Flower f4 = new Flower("Rose", "yellow", 60,
                LocalDate.of(2017, Month.AUGUST, 9),
                BigDecimal.valueOf(50.0));
        Flower f5 = new Flower("Orchid", "red", 40,
                LocalDate.of(2017, Month.AUGUST, 9),
                BigDecimal.valueOf(80.0));
        Cactus c1 = new Cactus("Hulio", Shape.ROUND, false, 25, BigDecimal.valueOf(50.0));
        Cactus c2 = new Cactus("Carlos", Shape.LONG,true, 50, BigDecimal.valueOf(100.0));
        Cactus c3 = new Cactus("Pedro", Shape.SQUARE,false, 15, BigDecimal.valueOf(40.0));

        /* Let's create some bouquets from items above and put it into the Collection */
        Bouquet b1 = new Bouquet();
        b1.addItems(f1, f2, f4);
        Bouquet b2 = new Bouquet();
        b2.addItems(c1, f1, f2);
        Bouquet b3 = new Bouquet();
        b3.addItems(f3, f5, c2, c3);

        Collection<Bouquet> bouquets = new ArrayList<>();
        bouquets.add(b1);
        bouquets.add(b2);
        bouquets.add(b3);

        /* Get info about each bouquet */
        System.out.println();
        for (Bouquet b : bouquets) {
            b.getInfoAboutBouquet();
        }

        /* Let's cut the f3 flower */
        System.out.println();
        f4.cutStem(15);
        b1.getInfoAboutBouquet();

        /* Let's find some flowers in the bouquets */
        System.out.println();
        b1.findFlowersByName("Rose");
        System.out.println();
        b2.findFlowersByName("Orchid");

        /* Let's find the most fresh bouquet */
        System.out.println();
        System.out.println("The most fresh bouquet is " + getMostFreshBouquet(bouquets));
    }

   public static Bouquet getMostFreshBouquet(Collection<Bouquet> bouquets) {
        if (bouquets.isEmpty()) {
            System.out.println("No bouquets found");
            return null;
        }

        Double maxFreshness = Double.MAX_VALUE;
        Double freshness = 0.0;
        Bouquet mostFresh = null;

        for(Bouquet b : bouquets) {

            try {
                freshness =  b.getFreshness();
            } catch (BouquetException e) {
                /*NOP*/
            }
            if(freshness < maxFreshness) {
                maxFreshness = freshness;
                mostFresh = b;
            }
        }
       return mostFresh;
    }

}


