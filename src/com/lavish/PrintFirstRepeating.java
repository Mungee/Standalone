package com.lavish;

import java.util.*;

public class PrintFirstRepeating {
    public static void main(String[] args) {
        int arr[] = {6,10,5,4,9,120,4,6,10};
        Set numSet = new HashSet();
        for(int i:arr){
            numSet.add(i);
        }
        printRepeatingJava8(arr, numSet);
    }

    private static void printRepeating(int[] arr, Set numSet) {

        for (int i : arr) {
            if (!numSet.add(i)) {
                System.out.println(i);
                return;
            }
        }
    }

    private static void printRepeatingJava8(int[] arr, Set numSet){
        Arrays.stream(arr)
                .filter(n->!numSet.add(n))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
