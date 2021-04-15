package org.example.polymorphism;

import org.example.inheritance.Dad;
import org.example.throwable.ThrowableTest;

/**
 * 属性优先父类
 * 方法优先子类
 * 那我想要执行子类的属性和父类的方法呢？可以通过类型转换去实现了，还有其他方式么？
 */
public class Polymorphism {
    ThrowableTest th = new Dad();


    public static void main(String[] args) {
        Polymorphism po = new Polymorphism();
        System.out.println(po.th.same);
        po.th.Same();
    }

}
