package com.walmart;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Print N numbers via 2 threads one for each even and odd number
 */
public class Even extends Thread{

    private Main obj;

    public Even(Main obj){
        this.obj = obj;
    }
    @Override
    public void run() {
        synchronized (this) {
            while (obj.getCounter().intValue() != 0) {
                while (obj.getOrder().get()) {
                    try {
                        Thread.currentThread().wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (obj.getCounter().intValue() % 2 == 0 && !obj.getOrder().get()) {
                    obj.getOrder().getAndSet(true);
                    System.out.println(Thread.currentThread() + "" + obj.getCounter().decrementAndGet());
                    notifyAll();
                }
            }
        }
    }
}
