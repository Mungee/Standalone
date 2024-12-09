package com.threads;

public class MultipleThreadAdder {

    int start;
    int end;
    Integer sum;

    MultipleThreadAdder(int start, int end){
        this.start = start;
        this.end = end;
        sum = 0;
    }

    public void add() {
        for (int i = this.start; i <= this.end; i++) {
            this.sum = this.sum + i;
            System.out.println(sum+":"+i);
        }
    }

    public void subtract(int start, int end) {
        for (int i = start; i <= end; i++) {
            this.sum = this.sum - i;
            System.out.println(sum+":"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultipleThreadAdder adder = new MultipleThreadAdder(0,5000);
        MultipleThreadAdder adder2 = new MultipleThreadAdder(5001,10000);
        Thread t1 = new Thread(()->{adder.add();});
        Thread t2 = new Thread(()->{adder2.add();});
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(adder.sum+adder2.sum);
    }

}
