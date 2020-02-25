package io.ascending.training.test;

public class Test_getProperty_getenv {
    public static void main(String[] args) {
        String log_dir = System.getProperty("log_dir", "/tmp/log");

        System.out.println(log_dir);

        System.getenv().forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });

        log_dir = System.getenv("SHELL");

        System.out.println("Obtain a single variable : " + log_dir);
    }
}
