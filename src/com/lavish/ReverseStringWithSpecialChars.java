package com.lavish;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringWithSpecialChars {
    public static void main(String[] args) {
        String input = "Swa$pn&il11";
        System.out.println(input);
        System.out.println(reverseAsCharArray(input));
        System.out.println(reverseAsCharArrayJava8(input));
    }

    private static String reverseAsCharArrayJava8(String input) {
        String reversedStr = Stream.of(input)
                .map(str->new StringBuilder(str).reverse())
                .collect(Collectors.joining());
        char[] arr = reversedStr.toCharArray();
        for(int i=0;i<input.length()/2;i++){
            if(!isNotSpecialChar(arr[i])){

            }
        }
        return null;
    }

    private static String reverseAsCharArray(String input){
        char[] arr = input.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            if (isNotSpecialChar(arr[left]) && isNotSpecialChar(arr[right])) {
                swap(arr, left, right);
                left++;
                right--;
            } else {
                if (!isNotSpecialChar(arr[left])) {
                    left++;
                }
                if(!isNotSpecialChar(arr[right])){
                    right--;
                }
            }
        }
        return String.valueOf(arr);
    }

    private static boolean isNotSpecialChar(char c){
       return Character.isAlphabetic(c) || Character.isDigit(c);
    }

    private static void swap(char[] arr, int left, int right) {
        char tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
