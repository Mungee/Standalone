package com.lavish.java17;

public class SwitchExpression {
    public static void main(String[] args) {
        String result = null;
        long s = (long) Math.floor((Math.random()*10));
        switch ((int) s){
            case 2,4,6,8 -> result = s+"Even";
            case 1,3,5,7,9 -> result = s+"Odd";
        }
        System.out.println(result);
    }
}
