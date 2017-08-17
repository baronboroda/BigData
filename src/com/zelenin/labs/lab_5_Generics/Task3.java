package com.zelenin.labs.lab_5_Generics;

import java.util.List;

/**
 * Created by user on 8/17/2017.
 */
public class Task3 {

    public static void main(String[] args) {

    }

    public <E extends Comparable<E>> E max(List<E> list, int begin, int end) {
        E max = list.get(begin);
        for(int i = begin + 1; i < end; i++) {
            if(list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }
}
