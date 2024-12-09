package com.lavish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SmallestDiffTwoArrays {

    public static void main(String[] args) {
        int[] a = {1, 3, 15, 11, 2};

        int[] b = {23, 127, 235, 19, 8};

        System.out.println(findSmallestDiffPair(a,b));
        System.out.println(findSmallestDiffPairJava8(a,b));
    }

    private static int findSmallestDiffPairJava8(int[] a, int[] b) {
        Optional<Pair> pair = IntStream.range(0, a.length)
                .mapToObj(x -> IntStream.range(0, b.length).mapToObj(y -> new Pair(a[x], b[y])))
                .flatMap(s -> s)
                .min(Comparator.comparingInt(i -> i.diff));
        if (pair.isPresent()) {
            System.out.println("The pair is " + pair.get());
            return pair.get().diff;
        }
        return 0;
    }

    static int findSmallestDiffPair(int[] a, int[] b){
        int minDiff = Integer.MAX_VALUE;
        String pair="";
        for(int i =0; i<a.length;i++){
            for(int j=0; j<b.length;j++){
                if(Math.abs(a[i]-b[j]) < minDiff){
                    minDiff = Math.abs(a[i]-b[j]);
                    pair = a[i]+","+b[j];
                }
            }
        }
        System.out.println("The pair is " + pair);
        return minDiff;
    }
}

class Pair{
    public final int diff;
    private int a;
    private int b;
    public Pair(int a, int b){
        this.a = a;
        this.b = b;
        diff = Math.abs(a - b);
    }

    @Override
    public String toString() {
        return a+","+b;
    }
}
