package com.lavish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntElements {

    public static void main(String[] args) {
        List<String> ls = Arrays.asList("as", "123", "32", "2as");
        onlyIntegers(ls);
        onlyIntegersJava8(ls);
    }

    private static void onlyIntegers(List<String> ls) {
        List<Integer> result = new ArrayList<>();
        for(String s:ls){
            try{
                result.add(Integer.parseInt(s));
            }catch (NumberFormatException ne){}
        }
        System.out.println(result);
    }

    private static void onlyIntegersJava8(List<String> ls) {
        List<Integer> result = ls.stream()
                .filter(s->s.matches("^[0-9]*$"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(result);
    }

}

