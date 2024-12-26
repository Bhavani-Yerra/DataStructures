package com.walmart;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private volatile AtomicInteger counter = new AtomicInteger(100);
    private volatile AtomicBoolean order = new AtomicBoolean(false);
    public static void main(String args[]){
        Main obj  = new Main();
        Even thread1 = new Even(obj);
        thread1.start();
        Odd thread2 = new Odd(obj);
        thread2.start();
    }

    public AtomicInteger getCounter(){
        return this.counter;
    }

    public AtomicBoolean getOrder(){
        return this.order;
    }
}
