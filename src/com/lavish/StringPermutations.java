package com.lavish;

import java.util.Arrays;

public class StringPermutations {
    public static void main(String[] args) {
        String str = "ABC";
        //generatePermutations(str,0,str.length()-1);
        Integer i1 = Arrays.asList(1,2,3,4,5).stream().findAny().get();

        synchronized(i1) { // y1

            Integer i2 = Arrays.asList(6,7,8,9,10)

                    .parallelStream()

                    .sorted() // y2

                    .findAny().get(); // y3

            System.out.println(i1+" "+i2);

        }
    }

    private static void generatePermutations(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
        } else {
            for(int i=start; i <= end; i++) {
                str = swap(str, start, i);
                generatePermutations(str, start+1, end);
            }
        }
    }

    private static String swap(String str, int left, int right) {
        char[] chars = str.toCharArray();
        char temp = chars[right];
        chars[right]=chars[left];
        chars[left] = temp;
        return String.valueOf(chars);
    }
}
