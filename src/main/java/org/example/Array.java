package org.example;

import org.example.inheritance.Dad;
import org.example.inheritance.Son;
import org.example.throwable.ThrowableTest;

import java.util.Arrays;

/**
 *
 */
public class Array {
    static String a;
    public static void main(String[] args) {
        int[] b = {8,12,1,23,123};
        Arrays.sort(b);
        System.out.println(Arrays.binarySearch(b, 9));
        System.out.println(Arrays.toString(b));
        System.out.println(a);
        System.out.println(Arrays.toString(Arrays.copyOf(b, 10)));
        //这操作规范么？不知道。先留个底
        ThrowableTest[]  a = {new Dad("1"),new Son(),new ThrowableTest(1)};



    }
}
