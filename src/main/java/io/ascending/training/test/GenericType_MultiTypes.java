package io.ascending.training.test;

public class GenericType_MultiTypes<T, U> {
    T obj1;
    U obj2;

    GenericType_MultiTypes(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        GenericType_MultiTypes<String, Integer> obj = new GenericType_MultiTypes<String, Integer>("Hello", 15);

        obj.print();
    }
}
