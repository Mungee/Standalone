package com.lavish;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        String Inputs = "({}";
        Stack<Character> stack = new Stack<>();
        char[] charArray = Inputs.toCharArray();
        for(char curr:charArray){
            if(curr=='{' || curr=='(' || curr=='[') {
                stack.push(curr);
            }
            else{
                if(stack.empty()){System.out.println("not valid");return;}
                char popped = stack.pop();
                if(curr=='}' && popped!='{') {System.out.println("not valid");return;}
                if(curr==')' && popped!='(') {System.out.println("not valid");return;}
                if(curr==']' && popped!='[') {System.out.println("not valid");return;}
            }
        }
        System.out.println("string is valid");
    }
}


/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true
Example 2:
Input: s = "()[]{}"
Output: true
Example 3:
Input: s = "(]"
Output: false
Inputs = "({})"
 */
