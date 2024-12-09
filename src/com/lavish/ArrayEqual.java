package com.lavish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayEqual {
    public static void main(String[] args) {
        int arr1[] = {21, 6, 8, 9, 10, 5};
        int arr2[] = {10, 21, 5, 8, 6};
        int arr3[] = {21, 7, 8, 9, 10, 5};
        int arr4[] = {21, 6, 8, 9, 10, 5};
        System.out.println(compare(arr1, arr2));
        System.out.println(compare(arr1, arr4));

    }

    private static boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        List result = IntStream.range(0, arr1.length)
                .mapToObj(x -> arr1[x] == arr2[x])
                .filter(b -> b.equals(true))
                .collect(Collectors.toList());

        return result.size() == arr1.length;
    }
}
