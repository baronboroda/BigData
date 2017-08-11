package com.zelenin.labs.lab_2_RegExp;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {

        String input = "Hello, my name is Max I'm 26 years old. name, Hello my.";
        System.out.println("------------Input text--------------");
        System.out.println(input);
        System.out.println();
        System.out.println("Words frequency: ");
        printWordsFrequency(input);
        System.out.println();
        printFirstUniqueWord(input);

    }

    public static void printWordsFrequency(String text) {

        for(String s : getDistinctWords(text)) {
            System.out.println(s + " --> " + getWordFrequency(splitTextIntoWords(text), s));
        }
    }

    public static void printFirstUniqueWord(String text) {
        System.out.println("First unique word is: " + getFirstUniqueWord(splitTextIntoWords(text), getDistinctWords(text)));
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

    public static String getFirstUniqueWord(String[] words, HashSet<String> distinct) {
        String result = "";
        for (String d : distinct) {
            int quantity = 0;
            for (String w : words) {
                if (d.equals(w)) {
                    if ((quantity++) > 2) {
                        break;
                    }
                }
            }
            if(quantity == 1) {
                result = d;
                break;
            }
        }
        return result;
    }

    public static LinkedHashSet<String> getDistinctWords(String text) {
        String[] words = splitTextIntoWords(text);
        List<String> myList = Arrays.asList(words);
        LinkedHashSet<String> mySet = new LinkedHashSet<>(myList);

        return mySet;
    }

    public static String[] splitTextIntoWords(String text) {
        text = text.replaceAll("[,.:!?]", " ");
        String[] words = text.split("\\s+");
        return words;
    }
}
