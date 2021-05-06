package org.example.polymorphism;

import org.example.inheritance.Dad;
import org.example.throwable.ThrowableTest;

import java.util.HashMap;

/**
 * 属性优先父类(换个说法吧，属性优先自己，随着引用)
 *          pu：也就说多态并没有体现在属性上
 * 方法优先子类
 * 那我想要执行子类的属性和父类的方法呢？可以通过类型转换去实现了，还有其他方式么？
 */
public class Polymorphism {
    ThrowableTest th = new Dad("1");

    public static void main(String[] args) {
        Polymorphism po = new Polymorphism();
        System.out.println(po.th.same);
        ThrowableTest dad = new Dad();
        System.out.println(((Dad)dad).b);
        po.th.Same();
        new HashMap();



        String s = new String();
    }

}
