package com.zelenin.labs.lab_2_RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {

    String input = "Are you O.K.? Who, me?! Yes. Mr. & Mrs. Smith and Dr." +
                    " John Doe. This is how I tried to split a paragraph into a sentence." +
                    " But, there is a problem. My paragraph includes dates like Jan.13, 2014 ," +
                    " words like U.S and numbers like 2.2. They all got split by the above code.";

    Matcher matcher = Pattern.compile("^.*?[a-z]{2,}[.!?]").matcher(input);
    while (matcher.find())
    {
        System.out.println(matcher.group(1));
    }

    }
}
