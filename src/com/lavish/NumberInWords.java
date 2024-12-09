package com.lavish;

import java.util.HashMap;
import java.util.Map;

public class NumberInWords {

    //5269 //five thousand two hundred sixty nine
    static Map<Integer, String> words = new HashMap();

    public static void main(String[] args) {
        words.put(1,"One");
        words.put(2,"Two");
        words.put(3,"Three");
        words.put(4,"Four");
        words.put(5,"Five");
        words.put(6,"Six");
        words.put(1,"Seven");
        words.put(2,"Eight");
        words.put(3,"Nine");
        words.put(4,"Ten");
        words.put(5,"Ten");
        words.put(6,"Eleven");
        words.put(1,"Twelve");
        words.put(2,"Thirteen");
        words.put(3,"Four");
        words.put(4,"Four");
        words.put(5,"Five");
        words.put(6,"Six");
        words.put(1,"Seven");
        words.put(2,"Eight");
        words.put(3,"Nine");
        words.put(4,"Ten");
        words.put(5,"Ten");
        words.put(6,"Eleven");

        num2word(5629);
    }

    static String num2word(int input){
        StringBuffer result = new StringBuffer();
        int remainder;

        if(input%1000 > 0){
            String firstChar=String.valueOf(input).substring(0,1);
            //result = result + words.get(firstChar) + "thousand";
            remainder = input % 1000;
        }
//        if(remainder%100) > 0){
//
//        }

        return result.toString();
    }
}

//@async
//how to implement circuit breaker

