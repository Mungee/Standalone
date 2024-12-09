package com.lavish;

import java.util.*;

public class FailSafe {

    static void failfast(){
        List<String> objs = new ArrayList<>();
        objs.add("2");
        //Uses internal iterator of the data structure
        for(String s:objs){
            objs.remove("2");
        }
        System.out.println(objs);
    }
    public static void main(String[] args) {
        failfast();
        //failsafe();
    }

    private static void failsafe() {
        List<String> objs = new ArrayList<>();
        objs.add("2");
        Iterator iter =objs.iterator(); // external iterator
        while(iter.hasNext()){
            String s = (String) iter.next();
            iter.remove();
        }
        System.out.println(objs);
    }
}
