package io.ascending.training.test.Test_Thread;

public class RaceConditionDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        Thread t3 = new Thread(counter, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        SafeCounterWithoutLock sc = new SafeCounterWithoutLock();
        Thread t4 = new Thread(sc, "Thread-4");
        Thread t5 = new Thread(sc, "Thread-5");
        Thread t6 = new Thread(sc, "Thread-6");

        t4.start();
        t5.start();
        t6.start();
    }
}
