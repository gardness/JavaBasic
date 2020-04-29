package io.ascending.training.test.Test_Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounterWithoutLock implements Runnable {
    private final AtomicInteger counter = new AtomicInteger(0);

    public int getValue() {
        return counter.get();
    }

    public void increment() {
        while (true) {
            int existingValue = getValue();
            int newValue = existingValue + 1;

            if (counter.compareAndSet(existingValue, newValue)) {
                return;
            }
        }
    }

    public void decrement() {
        while (true) {
            int existingValue = getValue();
            int newValue = existingValue - 1;

            if (counter.compareAndSet(existingValue, newValue)) {
                return;
            }
        }
    }

    @Override
    public void run() {
        this.increment();
        System.out.println("Value for Thread After increment "
                + Thread.currentThread().getName() + " " + this.getValue());

        this.decrement();
        System.out.println("Value for Thread at last "
                + Thread.currentThread().getName() + " " + this.getValue());
    }
}
