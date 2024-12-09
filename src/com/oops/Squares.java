package com.oops;

import java.util.function.Predicate;

class Animal{
    String sd;
     public static void main(String[] args) {
         int total = 0;

         StringBuilder letters = new StringBuilder("abcdefg");

         total += letters.substring(1, 2).length();

         total += letters.substring(6, 6).length();

         total += letters.substring(3, 2).length();

         System.out.println(total);

     }

private static boolean test(Predicate<Integer> p) {

         return p.test(5);

         }
 }

public class Squares {

    public static long square(int x) {

        long y = x * (long) x;

        x = -1;

        return y;

    }

    public static void main(String[] args) {

        int value = 9;

        long result = square(value);

        System.out.println(value);

    } }
