package com.lavish;/*
AI: Sure!
You can create a function that takes in a number and returns its opposite.
Here's how you can do it:
*/

public class OppositeNumber {
    public static int getOpposite(int number) {
        return -number;
    }

    public static void main(String[] args) {
        int number = 10;
        int negativeNumber = getOpposite(number);
        System.out.println("Original number: " + number);
        System.out.println("Negative number: " + negativeNumber);
    }
}
