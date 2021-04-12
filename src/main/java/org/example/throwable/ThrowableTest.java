package org.example.throwable;

/**
 * 这个类主要看见异常栈的输出。
 */
public class ThrowableTest {
    protected int a = 1;
    int b = 2;
    protected static int c = 1;

    static void a() throws Exception {
        System.out.println("aaa");
        b();
    }
    static void b() throws Exception {
        System.out.println("bbb");
        c();
    }
    static void c() throws Exception {
        System.out.println("ccc");
        try {
            d();
            int a = 1/0;
        }catch (Exception e) {
            throw new Exception("啦啦啦");
        }
        e();
    }
    public static void d(){
        System.out.println("ddd");
    }
    static void e(){
        System.out.println("eee");
    }



    public static void main(String[] args)   {
        new ThrowableTest();
        System.out.println("555");
        try {
            a();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("final");


    }
}
