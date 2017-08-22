package com.zelenin.labs.lab_6_HashMap;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by user on 8/22/2017.
 */
public class MyMap <K, V> {

    private MyEntry<K, V> [] entry;

    public MyMap() {}

    public void put(K key, V value) {

        /*if(key == null) {
            entry[0] = new MyEntry(key, value, entry[1]);
        }*/

    }

    public int size() {
        return this.entry.length;
    }

    public static void main(String[] args) {
        MyMap map = new MyMap();
        map.put("Lars", 1);
        //System.out.println(map);
    }
}

class MyEntry <K, V> {

    private K key;
    private V value;
    private MyEntry next;

    public MyEntry(K key, V value, MyEntry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
