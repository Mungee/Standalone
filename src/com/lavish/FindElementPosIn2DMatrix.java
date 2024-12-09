package com.lavish;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.IntStream;

public class FindElementPosIn2DMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{10, 20, 30, 40},

                {15, 25, 35, 45},

                {27, 29, 37, 48},

                {31, 33, 36, 51},

                {232,313, 336, 351}
        };

        int x = 351;

        System.out.println("Found at "+findPosJava8(arr, x));
    }

    static private String findPos(int[][] arr, int x) {
        String pos = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (x == arr[i][j]) {
                    pos = "(" + i + "," + j + ")";
                }
            }
        }
        return pos;
    }

    static private String findPosJava8(int[][] arr, int x) {
        AtomicInteger resultRow= new AtomicInteger(-1);
        AtomicInteger resultCol= new AtomicInteger(-1);

        IntStream.range(0, arr.length)
                    .flatMap(row-> IntStream.range(0, arr[row].length).map(col->{
                        int element = arr[row][col];
                        if(element == x) {
                            resultRow.set(row);
                            resultCol.set(col);
                        }
                        return col;
                    })).sum();

        return "("+resultRow+","+resultCol+")";
    }
}
