package org.example.throwable;

import java.net.SocketException;

/**
 * 这个类主要看见异常栈的输出。
 * note:感觉到一个东西啊，
 *      1、异常最好是在最后一层try  catch一下？这样可以保证程序正常运行？。
 *      2、catch的时候最好打一个异常栈，不要啥都不做啊？
 */
public class ThrowableTest {
    protected int a = 1;
    public int b = 2;
    protected static int c = 1;
    private int  o = 3;
    public String same = "ThrowableTest";

    public ThrowableTest(int a) {
        this.a = a;
    }

    private ThrowableTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    static void a()  throws Exception  {
        System.out.println("aaa");
        b();
    }
    static void b() throws Exception {
        System.out.println("bbb");
        c();
    }
    static void c() throws Exception  {
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
    public void ThrowableAlone() throws Exception{
        System.out.println("i am yeye");
        try {
            throw new SocketException();
        }catch (SocketException e ){
            e.printStackTrace();
        }
    }



    public static void main(String[] args)  throws Exception  {
        new ThrowableTest(1);
        System.out.println("555");
        try {
            a();
        } catch (Exception e) {
            e.printStackTrace();

        }
        a();

        System.out.println("final");
       // InvocationTargetException


    }
}
