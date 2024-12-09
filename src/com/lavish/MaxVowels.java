package com.lavish;

import java.util.*;
import java.util.stream.Collectors;

public class MaxVowels {

    public static final String SPACE_DELIM = " ";
    public static final String BLANK = "";
    public static final String VOWEL_REGEX = "[^aeiouAEIOU]";

    static void printMaxVowels(String input) {
        String[] inputs = input.split(SPACE_DELIM);
        Map<Integer, List<String>> result = new HashMap<>(); //key : number of vowels, value list of words
        for (String s : inputs) {
            int length = s.length();
            String s1 = s.replaceAll(VOWEL_REGEX, BLANK);
            int key = s1.length(); //remainder is the number of vowels found in the word
            List<String> l = result.getOrDefault(key, new ArrayList<>());
            l.add(s);
            result.put(key, l);
        }
        result.entrySet().stream().max((e1, e2)->e1.getKey()- e2.getKey()).ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps right over the little lazy dog";
        printMaxVowels(input);
        printMaxVowelsJava8(input);
    }

    private static void printMaxVowelsJava8(String input) {
        Arrays.stream(input.split("\\s"))
                .collect(Collectors.groupingBy(x->x.toString().replaceAll(VOWEL_REGEX,"").length()))
                .entrySet()
                .stream()
                .sorted((x,y)-> y.getKey()- x.getKey()) //vowel count is the key
                .findFirst().ifPresent(System.out::println);
    }

}
