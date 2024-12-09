package com.oops;

interface FromMetal {
 default public double weight() {
 return 5.6;
 }
}

interface Moveable {
 default double move() {
 return 4;
 }
}

class Car implements Moveable, FromMetal {

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 private String name = "Default Car";
 public double weight() {
return FromMetal.super.weight();
 }
 public double move() {
return Moveable.super.move();
 }
}

class Main {
 public static void main(String[] args) {
 FromMetal fromMetal = new Car();
 Moveable movable = new Car();
 Car car = new Car();

 weight(fromMetal);
 move(movable);

 weight(car);
 move(car);
 }


 public static void weight(FromMetal fromMetal) {
 System.out.print(fromMetal.weight());
 }


 public static void move(Moveable moveable) {
 System.out.print(moveable.move());
 }

}