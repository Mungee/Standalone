package com.lavish;

import java.util.*;

public class BalancedBrackets {

    static Map<String, String> matchingBrackets = new HashMap<>();

    public static void main(String[] args) {
        matchingBrackets.put("{", "}");
        matchingBrackets.put("[", "]");
        matchingBrackets.put("(", ")");

        String expression = "[()]{}{[()()]()}";
        System.out.println(isBalanced(expression));
        String exp = "[(])";
        System.out.println(isBalanced(exp));
    }

    private static boolean isBalancedJava8(String expression) {
        StringBuilder copy = new StringBuilder(expression);
         expression.chars()
                .mapToObj(c->String.valueOf((char)c))
                .filter(c->c.matches("[\\[{(]"))
                .forEach(c->{
                    int idx = copy.indexOf(matchingBrackets.get(c));
                    copy.deleteCharAt(idx);
                });
                //.findAny();
        System.out.println(copy);
        return copy.toString().matches("[\\]})]");
    }

    private static boolean isBalanced(String expression){
        Stack<String> bracketStack = new Stack<>();
        for(int i=0;i<expression.length();i++){
            if(expression.substring(i, i+1).matches("[\\[{(]")){
                bracketStack.push(expression.substring(i,i+1));
            } else {
                String chr = bracketStack.pop();
                if(!matchingBrackets.get(chr).equals(expression.substring(i, i+1))){
                    return false;
                }
            }
        }
        return true;
    }
}
