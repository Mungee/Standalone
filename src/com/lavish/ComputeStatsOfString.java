package com.lavish;

import java.util.*;
import java.util.stream.Collectors;

public class ComputeStatsOfString {
    
    public static final String SPACE_DELIM = " ";
    public static final String BLANK = "";
    public static final String VOWEL_REGEX = "[^aeiouAEIOU]";

    /**
     * https://autocode-next.lab.epam.com/courses/1372/syllabus/5599
     *
     * @param line
     * @return
     */
    public String findLongestWord(String line) {
        Optional<String> max = Arrays.stream(line.split("\\s"))
                .max((x,y)->x.length()-y.length());
        if(max.isPresent()){
            return max.get();
        }
        return null;
    }

    /**
     * https://autocode-next.lab.epam.com/courses/1372/syllabus/5603
     *
     * @param line
     * @return
     */
    public static String findWordHasGreatestNumberOfVowels(String line) {
        String[] inputs = line.split(SPACE_DELIM);
        Map<Integer, List<String>> result = new HashMap<>(); //key : number of vowels, value list of words
        for (String s : inputs) {
            int length = s.length();
            String s1 = s.replaceAll(VOWEL_REGEX, BLANK);
            int key = length - s1.length(); //remainder is the number of vowels found in the word
            List l = result.getOrDefault(key, new ArrayList<>());
            l.add(s);
            result.put(key, l);
        }
        Optional<Integer> maxVowels = result.keySet().stream().max(Integer::compareTo);
        if (maxVowels.isPresent()) {
            return result.get(maxVowels.get()).get(0);
        }
        return null;
    }

    public static void main(String[] args) {
        findWordHasGreatestNumberOfVowelsJava8("abcd abcdefg abcdef");
        findWordHasGreatestNumberOfVowels( "The quick brown fox jumps right over the little lazy dog");
    }

    private static void findWordHasGreatestNumberOfVowelsJava8(String line) {
        Arrays.stream(line.split("\\s"))
                .collect(Collectors.toList())
                .stream();
                //.max(x->x.)
    }
}
