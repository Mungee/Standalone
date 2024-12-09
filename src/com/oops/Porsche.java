package com.oops;

public class Porsche extends Car {
    private String name = "Porsche";

    public static void main(String[] args) {
        Car car = new Porsche();
        System.out.println(car.getName());

        Porsche porsche = new Porsche();
        System.out.println(porsche.getName());
    }

}
