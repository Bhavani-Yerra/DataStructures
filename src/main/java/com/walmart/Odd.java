package com.walmart;

public class Odd extends Thread{
    private Main obj;

    public Odd(Main obj){
        this.obj = obj;
    }
    @Override
    public void run() {
        synchronized (this) {
            while (obj.getCounter().intValue() != 0) {
                while (!obj.getOrder().get()) {
                    try {
                        Thread.currentThread().wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (obj.getCounter().intValue() % 2 != 0 && obj.getOrder().get()) {
                    obj.getOrder().getAndSet(false);
                    System.out.println(Thread.currentThread() + "" + obj.getCounter().decrementAndGet());
                    notifyAll();
                }
            }
        }
    }
}