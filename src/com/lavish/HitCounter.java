package com.lavish;

import java.util.ArrayList;
import java.util.List;

public class HitCounter {

    static List<Integer> hits = new ArrayList<>();
    static int X = 300;
    public static void hit(Integer timestamp){
        hits.add(timestamp);
    }

    public static int countHits(Integer timestamp){
        int result=0;
        for(int i= hits.size()-1;i >= 0;i--){
            if((timestamp - hits.get(i)) < X){
                result++;
            }else{
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        hit(1);
        hit(2);
        hit(3);
        System.out.println(countHits(4));
        hit(300);
        System.out.println(countHits(300));
        System.out.println(countHits(301));
    }
}
