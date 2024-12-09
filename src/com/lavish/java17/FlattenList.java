package com.lavish.java17;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 4, 5),
                Arrays.asList(5, 6, 7)
        );

       List l = Collections.singletonList(listOfLists.stream().flatMap(Collection::stream).distinct().collect(Collectors.toList()));
    }

}
