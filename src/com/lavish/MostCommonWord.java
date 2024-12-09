package com.lavish;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonWord {



    public void print(Integer i) {

        System.out.println("Integer");

    }



    public void print(int i) {

        String strSentencem= "Hi Nitish Bye Nitish Hi Bye Nitish GoodBye Nitish Bye Bye Nitish Welcome Nitish ";
        Arrays.stream(strSentencem.split("\\s"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
//                .peek(System.out::println)
                .filter(x -> x.getValue() > 1)
                .sorted((x, y) -> Math.toIntExact(x.getValue() - y.getValue()))
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

    }



    public void print(long i) {

        System.out.println("long");

    }



    public static void main(String args[]) {

        MostCommonWord mostCommonWord = new MostCommonWord();

        mostCommonWord.print(10);

    }

}