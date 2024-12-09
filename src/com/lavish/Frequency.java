package com.lavish;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given input "aabbaacc" find the frequency of each character in the word
public class Frequency {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    private Integer salary;

    public static void frequencyInString(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        int count=0;
        for(int i=0; i < chars.length; i++){
            count++;
            if(i==chars.length-1 || chars[i]!=chars[i+1] ){
                System.out.println(chars[i] +":"+count);
                count=0;
            }
        }
    }

    public static void main(String[] args) {
        frequencyInString("Aaabbaaaccaaacccba");
        //frequencyJava8("Aaabbaaaccaaacccba");
    }


//    static void frequencyJava8(String input){
//        input.chars()
//                .mapToObj(chr->(char)chr)
//                .collect(Collectors.partitioningBy(chr->Character.toUpperCase(chr),Collectors.counting()))
//                .forEach((k,v)->System.out.println(k+"::"+v));
//
//    }
}

