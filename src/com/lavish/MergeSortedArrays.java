package com.lavish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeSortedArrays {
    static int arr1[] = {1, 3, 4, 5};
    static int arr2[] = {2, 4, 6, 8};

    public static void main(String[] args) {
        int[] sorted = mergeSortedJava8(arr1, arr2);
        Arrays.stream(sorted).forEach(System.out::print);
    }

    private static Integer[] mergeSorted(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result.add(arr1[i++]);
            } else {
                result.add(arr2[j++]);
            }
        }
        while (i < arr1.length) {
            result.add(arr1[i++]);
        }
        while (j < arr2.length) {
            result.add(arr2[j++]);
        }
        return result.toArray(new Integer[0]);
    }

    private static int[] mergeSortedJava8(int[] arr1, int[] arr2) {
        return Stream.of(arr1, arr2)
                .flatMapToInt(x -> Arrays.stream(x))
                .sorted()
                .toArray();
    }
}
