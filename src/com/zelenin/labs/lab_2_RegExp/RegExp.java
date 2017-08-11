package com.zelenin.labs.lab_2_RegExp;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {

        String input = "Hello, my name is Max I'm 26 years old. name, Hello my.";
        printWordsFrequency(input);


    }

    public static void printWordsFrequency(String text) {

        text = text.replaceAll("[!?.:,]", "");
        String[] words = text.split("\\s+");

        List<String> myList = Arrays.asList(words);
        Set<String> mySet = new HashSet<String>(myList);

        for(String s : mySet) {
            System.out.println(s + " --> " + getWordFrequency(words, s));
        }
    }

    public static int getWordFrequency(String[] words, String word) {
        int result = 0;
        for (String s : words) {
            if (s.equals(word)) {
                result++;
            }
        }
        return result;
    }

}
