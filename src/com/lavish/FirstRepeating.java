package com.lavish;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeating {
    //Print the first repeating element
    public static void main(String[] args) {
        String input = "JavJ Articles are Awesome";
        Set<Integer> a = new HashSet();
        System.out.println((char)input.chars().filter(x->!a.add(x)).findFirst().getAsInt());
    }
}
