package org.example.collection;

import java.util.List;

public class GenericityDemo<A> implements GenericityInerface<A> {

    @Override
    public A test() {
        return null;
    }

    @Override
    public <T> void testMethod(T t) {

    }
}
