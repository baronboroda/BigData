package com.zelenin.labs.lab_2_RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class RegExp {
    public static void main(String[] args) {

        String input = "Hello, my name is Max I'm 26 years old. name, Hello my.";

        /*Matcher matcher = Pattern.compile("(?\b\w+\b)(?!.+\b\k\b)").matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }*/

        input = input.replaceAll("[!?.,]", "");
        String[] words = input.split("\\s+");


        Set<String> wordsSet = new HashSet<String>(Arrays.asList(words));
        for(String s: wordsSet){
            System.out.println(s + " " ;
        }

    }

    public static int getFrequency(String[] words, String word) {

        int result = 0;
        for (String s : words)
            if (s.equals(word)) { result++; }

        return result;
    }
}
