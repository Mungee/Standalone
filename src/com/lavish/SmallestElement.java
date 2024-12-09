package com.lavish;

import java.util.*;
import java.util.stream.Collectors;

public class SmallestElement {
    static int findSmallestIterative(int[] A) {
        int ans = A[0];
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        OptionalInt result = Arrays.stream(arr)
                .sorted()
                .skip(k+l-1)
                .limit(r)
                .findFirst();

        return result.getAsInt();
    }

    static List<Integer> removeEven(List<Integer> arr){
        return arr.stream()
                .filter(x->!(x%2==0))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[]{-1, 1, -2, 2, -3}, 0, 5, 2));
        System.out.println(kthSmallest(new int[]{7, 10, 4, 3, 20, 15}, 0, 5, 3));
        System.out.println(findSmallestIterative(new int[]{-1000, 1000, 2, 1}));
        System.out.println(findSmallestIterative(new int[]{1000, 2, 1}));
        List<Integer> list;
        Integer[] arr = new Integer[]{1000, 2, 1};
        list = Arrays.stream(arr).collect(Collectors.toList());
        System.out.println(removeEven(list));
    }
}
