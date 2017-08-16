package com.zelenin.labs.lab_4_Decorator;

public class FlowerShop {
    public static void main(String[] args) {
        Flower f1 = new Flower(true, 10, new FlowerSpec(FlowerColor.RED, 50, FlowerType.MAK));
        Flower f2 = new Flower(true, 30, new FlowerSpec(FlowerColor.BLACK, 40, FlowerType.ROMASHKA));
        Flower f3 = new Flower(true, 40, new FlowerSpec(FlowerColor.GREEN, 35, FlowerType.ROZA));
        Flower f4 = new Flower(true, 35, new FlowerSpec(FlowerColor.BLUE, 55, FlowerType.TULPAN));
        Flower f5 = new Flower(true, 25, new FlowerSpec(FlowerColor.RED, 45, FlowerType.ROMASHKA));

        FlowerBucket fb1 = new FlowerBucket();
        fb1.addFlowers(f1, f2, f3);

        FlowerBucket fb2 = new FlowerBucket();
        fb2.addFlowers(f3, f4);

        ItemDecorator pd = new PaperDecorator(fb1);
        ItemDecorator rd = new RibbonDecorator(fb2);

        Order o1 = new Order();
        o1.addItem(pd);
        o1.addItem(rd);

        System.out.println(o1.calculateTotalPrice());
    }
}
