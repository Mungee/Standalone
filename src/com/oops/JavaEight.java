package com.oops;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class JavaEight {

    public static void main(String[] args) {
//
//        String strSentence ="Hi Vishal Bye Vishal Hi Bye Vishal Welcome Vishal Good Bye Vishal";
//        Arrays.stream(strSentence.split("\\s"))
//                .collect(Collectors.groupingBy(x->x,Collectors.counting()))
//                .entrySet()
//                .stream().filter(x->x.getValue()>1)
//                .sorted((x,y)-> x.getKey().compareTo(y.getKey()))
//                .forEach(x-> System.out.println());

        //Output = {Bye-3,Hi-2,Vishal-5}

        AtomicInteger nbr = new AtomicInteger(0);
        String str = "SEG2SEG3SEGMENT5";
        Arrays.stream(str.split("(?<=[0-9])(?=[A-Za-z])"))
                .forEach(System.out::println);
    }

}
