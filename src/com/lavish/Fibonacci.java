package com.lavish;

public class Fibonacci {

    public static void main(String[] args) {

        generateFibonacci(50);

    }

    private static void generateFibonacci(int limit) {
        int i = 1;
        int prev = 0;
        int next = 1;
        int tmp ;
        while(i < limit){
            tmp = next;
            next = next + prev;
            System.out.print(prev);
            prev = tmp;
            i++;
        }
    }
}
