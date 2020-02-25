package io.ascending.training.test;

public class GenericType<T> {
    T obj;

    GenericType(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }

    public static void main(String[] args) {
        GenericType<Integer> iObj = new GenericType<Integer>(15);
        System.out.println(iObj.getObject());

        GenericType<String> sObj = new GenericType<String>("Hello");
        System.out.println(sObj.getObject());
    }
}
