package com.lavish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class worldline {

    //1,2,3,4 separate odd-even

//    List<Integer> list1 = new ArrayList<Integer>();
//
//    list1.stream().map(x->if(x%2==0){eveList.add(x)} else oddList.add(x));
//    evenList=list1.stream().filter(x->x%2==0).collect(Collectors.toList());
public static void main(String[] args) {
    String myString ="my name is vishal";
    char[] chars = myString.toCharArray();

    //myString.chars().collect(Collectors.groupingBy(x->x));

    Arrays.stream(myString.split(" ")).sorted(Comparator.reverseOrder()).forEach(System.out::println);

}


}


