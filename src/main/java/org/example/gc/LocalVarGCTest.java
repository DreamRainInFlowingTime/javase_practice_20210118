package org.example.gc;


public class LocalVarGCTest {
    public static void main(String[] args) {
        localVarGC5();
    }

    /**
     * 数组被a引用，不能被回收
     * [GC (System.gc())  12206K->10968K(123904K), 0.0046455 secs]
     */
    public static void localVarGC1() {
        byte[] a = new byte[10 * 1024 * 1024];
        System.gc();
    }

    /**
     * 数组没有引用，可以被回收
     * [GC (System.gc())  12206K->704K(123904K), 0.0007060 secs]
     */
    public static void localVarGC2() {
        byte[] a = new byte[10 * 1024 * 1024];
        a = null;
        System.gc();
    }

    /**
     * 虽然a变量已经失效，但是因为方法还没结束，
     * a变量依然存在于局部变量表中，并指向数组，所以byte数组不能被回收
     * [GC (System.gc())  12206K->11000K(123904K), 0.0044869 secs]
     */
    public static void localVarGC3() {
        {
            byte[] a = new byte[10 * 1024 * 1024];
        }
        System.gc();
    }

    /**
     * a变量失效，c变量复用了a的槽位，使得byte数组的引用失效，所以byte数组会被回收
     * [GC (System.gc())  12206K->744K(123904K), 0.0008775 secs]
     */
    public static void localVarGC4() {
        {
            byte[] a = new byte[10 * 1024 * 1024];
        }
        int c = 10;
        System.gc();
    }

    /**
     * localVarGC1()方法中byte数组没有被回收
     * localVarGC1()执行完后，localVarGC1()的栈帧被销毁，byte数组也就没有了引用
     * localVarGC5()GC时可以将byte数组回收
     * <p>
     * [GC (System.gc())  12206K->10896K(123904K), 0.0041066 secs]
     * [Full GC (System.gc())  10780K->540K(123904K), 0.0029822 secs]
     */
    public static void localVarGC5() {
        try {
            System.out.printf("111");
            localVarGC1();
            System.gc();
        }catch (Error e){
            e.printStackTrace();
        }
        new LocalVarGCTest();
        System.out.printf("222");

    }
}

