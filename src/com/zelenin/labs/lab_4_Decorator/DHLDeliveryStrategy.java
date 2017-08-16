package com.zelenin.labs.lab_4_Decorator;

import java.util.LinkedList;

public class DHLDeliveryStrategy implements IDelivery {

    public void deliver(LinkedList items) {
        System.out.println("Delivered by DHL");
    }
}
