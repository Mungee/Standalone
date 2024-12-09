package com.lavish;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxCountWords {

    public static void main(String[] args) {
        String str="Rahul is employee of Epam company, rahul is from Pune, RAHUL! is good in algorithms";
        Arrays.stream(str.split("\\s"))
                .map(i->i.replaceAll("[^a-zA-Z]",""))
                .collect(Collectors.groupingBy(String::toLowerCase,  Collectors.counting()))
                .entrySet()
                .stream().max((x,y)-> Math.toIntExact(x.getValue() - y.getValue()))
                .ifPresent(System.out::println);
    }
}
