package com.lavish;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindDuplicates {
    public static void main(String[] args) {
        Set hs = new HashSet();
        List<Integer> ints = Arrays.asList(1,2,3,1,2);
//        ints.stream()
//                .filter(x->!hs.add(x))
//                .forEach(System.out::println);
        ints.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


    }
}
