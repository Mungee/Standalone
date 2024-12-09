package com.lavish;

import java.util.Arrays;

public class MergedTwoSortedArray {

    static void m2s(int[] one, int[] two){
        int i1 = one.length + two.length;
        int[] merged = new int[i1];
        int x = 0,y=0,z=0;
        while(x<one.length && y<two.length){
            if (one[x] < two[y]) {
                merged[z++] = one[x++];
            } merged[z++] = two[y++];
        }
        Arrays.stream(merged)
                        .forEach(System.out::print);
    }
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7}, b[] = {1,2, 4, 6, 8};
        m2s(a,b);
    }
}
