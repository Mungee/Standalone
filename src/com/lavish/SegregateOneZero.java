package com.lavish;

import java.util.Arrays;

public class SegregateOneZero {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,1,0,1,1,0};
        int[] result = new int[arr.length];
        //Arrays.fill(result,1);
        int count = 0;
        for(int i:arr){
            if(i==1){
                count++;
            }
        }
        for(int i=arr.length-count;i<arr.length;i++){
            result[i]=1;
        }
        Arrays.stream(result).forEach(System.out::println);
    }
}
