package com.zelenin.labs.lab_2_RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {

        String input = "Hello, my name is Max I'm 26 years old. name, Hello.";

        /*Matcher matcher = Pattern.compile("(?!^)\\b").matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }*/

        input = input.replaceAll("[!?.,]", "");
        String[] words = input.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

    }
}
