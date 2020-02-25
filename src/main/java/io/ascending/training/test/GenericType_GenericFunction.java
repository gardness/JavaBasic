package io.ascending.training.test;

import java.util.ArrayList;

public class GenericType_GenericFunction {
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

//    public static void main(String[] args) {
//        genericDisplay(11);
//        genericDisplay("hello");
//        genericDisplay(1.0);
//    }

//    public static void main(String[] args) {
//        ArrayList a1 = new ArrayList();
//
//        a1.add("Sachin");
//        a1.add("Rahul");
//        a1.add(10);
//
//        String s1 = (String)a1.get(0);
//        String s2 = (String)a1.get(1);
//
//        // Causes Runtime Exception
//        String s3 = (String)a1.get(2);
//    }

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<String>();

        a1.add("Sachin");
        a1.add("Rahul");

        a1.add(10);

        String s1 = (String)a1.get(0);
        String s2 = (String)a1.get(1);
        String s3 = (String)a1.get(2);
    }
}
