package org.example.throwable;

import java.lang.reflect.InvocationTargetException;

/**
 * 这个类主要看见异常栈的输出。
 * note:感觉到一个东西啊，
 *      1、异常最好是在最后一层try  catch一下？这样可以保证程序正常运行？。
 *      2、catch的时候最好打一个异常栈，不要啥都不做啊？
 */
public class ThrowableTest {
    protected int a = 1;
    int b = 2;
    protected static int c = 1;
    private int  o = 3;
    public String same = "ThrowableTest";

    public ThrowableTest(int a) {
        this.a = a;
    }

    static void a()    {
        System.out.println("aaa");
        b();
    }
    static void b()  {
        System.out.println("bbb");
        c();
    }
    static void c()   {
        System.out.println("ccc");
        try {
            d();
            // a = 1/0;
        }catch (Exception e) {
            //throw new Exception("啦啦啦");
        }
        int b = 1/0;

        e();
    }
    public static void d(){
        System.out.println("ddd");
    }
    static void e(){
        System.out.println("eee");
    }

    public void Same(){
        System.out.println("i am ThrowableTest");
    }



    public static void main(String[] args)  throws Exception  {
        new ThrowableTest(1);
        System.out.println("555");
        try {
            a();
        } catch (Exception e) {
            e.printStackTrace();

        }



        System.out.println("final");
       // InvocationTargetException


    }
}
