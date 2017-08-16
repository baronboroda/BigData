package com.zelenin.labs.lab_4_Decorator;

import java.util.LinkedList;

public class PostDeliveryStrategy implements IDelivery {

    public void deliver(LinkedList items) {
        System.out.println("Delivered by post");
    }
}
