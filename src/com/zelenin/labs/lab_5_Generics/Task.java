package com.zelenin.labs.lab_5_Generics;

import java.util.ArrayList;

/**
 * Created by user on 8/17/2017.
 */
public class Task {

    public static void main(String[] args) {
        String[] str_array = {"apple", "orange", "melon"};
        for(String s : str_array) {
            System.out.println(s);
        }
        exchange(str_array, 0, 2);
        for(String s : str_array) {
            System.out.println(s);
        }

    }

    public static <T> void exchange(T[] array, int index1, int index2) {
        if((index1 > array.length - 1) || (index2 > array.length - 1)) {
            System.err.println("Error");
            return;
        }
        T tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

}
