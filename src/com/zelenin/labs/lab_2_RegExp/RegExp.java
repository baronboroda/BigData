package com.zelenin.labs.lab_2_RegExp;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {

        String input = "Hello, my name is Max! I attend \"Big Data\" courses in Epam IT Academy. " +
                        "This is my text example for the string processing task. Hello (just repeat first word).";

        System.out.println("------------Input text--------------");
        System.out.println(input);
        System.out.println();

        System.out.println("Words frequency: ");
        printWordsFrequency(input);

        System.out.println();
        printFirstUniqueWord(input);

        //System.out.println(splitTextIntoSentences(input));

        System.out.println();
        System.out.println(changeWordsInSentences(input));

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

    public static String getFirstUniqueWord(String[] words, String[] distinct) {
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

    public static String[] getDistinctWords(String text) {
        String[] words = splitTextIntoWords(text);
        List<String> myList = Arrays.asList(words);
        LinkedHashSet<String> mySet = new LinkedHashSet<>(myList);

        return mySet.toArray(new String[mySet.size()]);
    }

    public static String[] splitTextIntoWords(String text) {
        text = text.replaceAll("[,.:!?/(/)]", " ");
        String[] words = text.split("\\s+");
        return words;
    }

    public static Collection<String> splitTextIntoSentences(String text) {

        Collection<String> sentences = new ArrayList<>();

        Pattern pattern = Pattern.compile("[^.:!?\\s][^.!?]*[.!?]?(?=\\s|$)");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            sentences.add(matcher.group());
        }
        return sentences;
    }

    public static String findFirstShortestWord(String sentence) {
        String result = "";

        String[] words = getDistinctWords(sentence);
        result = words[0];
        for(String w : words) {
            if(result.length() < w.length()) {
                result = w;
            }
        }
        return result;
    }

    public static String findFirstLongestWord(String sentence) {
        String result = "";

        String[] words = getDistinctWords(sentence);
        result = words[0];
        for(String w : words) {
            if(result.length() > w.length()) {
                result = w;
            }
        }
        return result;
    }

    public static String changeWordsInSentences(String text) {
        String result = "";

        for(String sentence : splitTextIntoSentences(text)) {
            result += sentence.replaceAll("\\b" + findFirstLongestWord(sentence) + "\\b", findFirstShortestWord(sentence));
        }

        return result;

    }
}
