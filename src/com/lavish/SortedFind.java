package com.lavish;

import java.util.Arrays;

public class SortedFind {

    static int findUsingJavaInbuilt(Integer[] arr, int findThis){
        int result;
        result  = Arrays.asList(arr)
                .indexOf(findThis);
        return result;
    }

    static int findUsingAlgo(Integer[] arr, int findThis){
        int result = -1;
        int left = -1;
        int right = arr.length;

        while(right > left+1){

            int middle = (left + right)/2;
            if (arr[middle] < findThis ) {
                left = middle;
            }else{
                right = middle;
            }

        }
        if(arr[right]==findThis) {
            result = right;
        }
        return result;
    }

    public static void main(String[] args) {
        Integer arr[] = {11, 23, 32, 52, 76, 81, 111, 135, 140, 170};
        Long start = System.nanoTime();
        System.out.println(findUsingAlgo(arr,111));
        System.out.println(System.nanoTime()-start);
        start = System.nanoTime();
        System.out.println(findUsingJavaInbuilt(arr,135));
        System.out.println(System.nanoTime() - start);
        System.out.println(findUsingJavaInbuilt(arr,110));
    }
}
