package com.lavish;

public class Singleton1 {
    private Singleton1 singleton1;

    private Singleton1(){

    }
    public Singleton1 getInstance(){
        if(singleton1==null){
            synchronized (this) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}

//select employeeID from employees where salary<(select max(salary) from employees where salary<(select max(salary) from employees))