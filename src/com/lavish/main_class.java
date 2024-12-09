package com.lavish;

interface alpha {
  default void reset() {
    System.out.println("This is com.lavish.alpha version of default");
  }
}

interface beta {
  default void reset() {
    System.out.println("This is com.lavish.beta version of default");
  }
}

class MyClas implements alpha, beta {

  void display() {
    System.out.println("This is not default");
  }

  @Override
  public void reset() {
    alpha.super.reset();
  }
}

public class main_class {
  public static void main(String args[]) {
    MyClas ob = new MyClas();
    ob.reset();
    ob.display();
  }  
}