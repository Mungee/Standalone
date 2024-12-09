package com.lavish;

public class StringChecker {

    public String str = "";

    public void test() {
        String innerStr = "";

        stringTester(str, innerStr);

        System.out.println("str = " + str);

        System.out.println("innerStr = " + innerStr);
    }

        public void stringTester(String str, String innerStr){
            this.str = "aaa";
            innerStr = "bbb";
        }

            public static void main (String[]args){

                StringChecker sc = new StringChecker();
                sc.test();
            }
        }