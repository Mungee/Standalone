package com.lavish;

public class Stairway {
    public static void main(String[] args) {
        int totalNoOfSteps = 5;
        System.out.println(climb(totalNoOfSteps));

    }


    public static int climb(int steps){
            int[] s = new int[steps];
            s[0] = 1;
            s[1] = 2;
            for(int i=2;i<steps;i++){
                s[i]=s[i-1]+s[i-2];
            }
            return s[steps-1];
    }
}
