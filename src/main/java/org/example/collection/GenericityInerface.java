package org.example.collection;

public interface GenericityInerface<B> {
    B test();

    public <T> void testMethod(T t);
}
