package com.lavish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//display FIZZ for numbers divisible by 3, BUZZ for numbers divisible by 5 & FIZZ BUZZ for numbers divisible by both 3 & 5.
public class FizzBuzz {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3,5,18,20,21,75);
        fizzBuzzJava8(input);
    }

    private static void fizzBuzz(List<Integer> input) {
        input.stream()
                .forEach(x->print(x));
    }

    private static void fizzBuzzJava8(List<Integer> input) {
        input.stream()
                .map(x->transform(x))
                .forEach(System.out::println);
    }

    private static String transform(Integer x) {
        if(x%3==0 && x%5==0) {return "FIZZBUZZ";}
        if(x%3==0){return "FIZZ";}
        else {return "BUZZ";}
    }

    private static void print(Integer x) {
        if(x%3==0 && x%5==0) {System.out.println("FIZZBUZZ"); return;}
        if(x%3==0){System.out.println("FIZZ"); return;}
        if(x%5==0){System.out.println("BUZZ");}
    }
}
