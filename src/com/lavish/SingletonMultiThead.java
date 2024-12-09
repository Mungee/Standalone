//package com.lavish;
//
//import java.util.Date;
//
//public class SingletonMultiThead {
//
//    public static void main(String[] args) {
//
//        Singleton1 s = Singleton1.getSingleton();
//
//        Singleton1 s2 = Singleton1.getSingleton();
//
//        Singleton1 s3 = Singleton1.getSingleton();
//
//        System.out.println(s.toString()+s2.toString()+s3.toString());
//    }
//
//}
//
//class Singleton{
//    static volatile Singleton1 singleton1;
//    static Object obj = new Object();
//
//    Date d;
//
//    private Singleton(){
//        d= new Date();
//    }
//
//    public static Singleton1 getSingleton() {
//        Singleton1 result = singleton1;
//        if(result==null){
//            synchronized(obj){
//                if(result==null){
//                    result = new Singleton1();
//                }
//            }
//        }
//        return result;
//    }
//
//    public String toString(){
//        return d.toString();
//    }
//}
