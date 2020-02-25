package io.ascending.training.test;

public class ThrowException {
    static void fun() throws NullPointerException {
//        try {
//            throw new NullPointerException("demo");
//        } catch (NullPointerException e) {
//            System.out.println("Caught inside fun().");
//            throw e;
//        }

        throw new NullPointerException();
    }

    static void fun1() throws IllegalAccessException {
        System.out.println("Inside fun1(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (NullPointerException e) {
            System.out.println("Caught in main.");
        }

//        fun1();
    }
}
