package org.example.collection;

public class GenericityDemo<A> implements GenericityInerface<A> {

    @Override
    public A test() {
        return null;
    }

    @Override
    public <T> void testMethod(T t) {

    }
}
