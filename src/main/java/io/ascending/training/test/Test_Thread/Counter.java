package io.ascending.training.test.Test_Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter implements Runnable {
    private int c = 0;
    private Lock lock = new ReentrantLock();

    public void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        c++;
    }

    public void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }

    @Override
    public void run() {
        lock.lock();

        for (int i = 0; i < 10; i++) {
            this.increment();
        }
        System.out.println("Value for Thread After increment "
                + Thread.currentThread().getName() + " " + this.getValue());
        for (int i = 0; i < 10; i++) {
            this.decrement();
        }
        System.out.println("Value for Thread at last "
                + Thread.currentThread().getName() + " " + this.getValue());

        lock.unlock();
    }
}

