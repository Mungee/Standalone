package com.lavish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Merge2Lists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4}));
        merge2ListsJava8(list1, list2);
    }
    static List merge2Lists(List<Integer> list1, List<Integer> list2) {
        int resultSize = list1.size() > list2.size() ? list1.size() : list2.size();
        List resultList = new ArrayList(resultSize);
        for(int i = 0;i < resultSize;i++){
            int sum = list1.get(i);
            if(i < list2.size()){
                sum = sum + list2.get(i);
            }
            resultList.add(sum);
        }
        return resultList;
    }
    static void merge2ListsJava8(List<Integer> list1, List<Integer> list2) {
        List<Integer> longList, shortList;
        if( list1.size() > list2.size()){
            longList = list1;
            shortList = list2;
        }else{
            longList = list2;
            shortList = list1;
        }

        IntStream.range(0, longList.size())
                .map(x->longList.get(x) + (x < shortList.size() ? shortList.get(x).intValue():0))
                .forEach(System.out::println);
    }

}
