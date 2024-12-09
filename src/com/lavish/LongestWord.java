package com.lavish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestWord {
    public static void main(String[] args) {
        String str =  "I am interested to grow in my organization";
        longestWord(str);
        longestWordJava8(str);
    }

    private static void longestWord(String str) {
        List<String> stringList = Arrays.asList(str.split(" "));
        int maxLen=0; String longestWord="";
        for(String s:stringList){
            if(maxLen<s.length()){
                maxLen = s.length();
                longestWord = s;
            }
        }
        System.out.println(longestWord);
    }

    private static void longestWordJava8(String str) {
        Arrays.stream(str.split("\\s"))
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
    }
}

