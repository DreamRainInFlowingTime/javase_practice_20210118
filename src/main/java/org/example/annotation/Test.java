package org.example.annotation;

import java.util.function.IntConsumer;

public class Test {


    public static void main(String[] args) {
        Class<Test> testClass = Test.class;

    }
    @Override
    public String toString() {
        IntConsumer intConsumer = (int x) -> {
            x = x + 1;
        };
        Runnable runnable = System.out::println;
        return super.toString();
    }
}
