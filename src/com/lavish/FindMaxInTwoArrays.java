package com.lavish;

import java.util.*;

public class FindMaxInTwoArrays {

    public static void main(String[] args) {
        List<List<Integer>> intList = new ArrayList<>();
        intList.add(Arrays.asList(1,2,3,4,5,6));
        intList.add(Arrays.asList(6,7,8,11, 10, 9));
        int n = 1;
        List<Integer> result = new ArrayList<>();
        result.addAll(intList.get(1));
        result.addAll(intList.get(0));
        System.out.println(intList.stream().flatMap(x->x.stream())
                .sorted(Comparator.reverseOrder())
                .skip(n)
                .max(Integer::compareTo)
        );
    }
}
