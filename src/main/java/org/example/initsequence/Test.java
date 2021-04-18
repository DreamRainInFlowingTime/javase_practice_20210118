package org.example.initsequence;

/**
 * 构造函数执行顺序验证
 *
 */
public class Test {
    int a = 1;
    String b ;

    {
        System.out.printf(a+"");
    }

    public Test(int a) {
        this.a = a;
    }
    public Test(String b){

    }

    public static void main(String[] args) {
        new Test(2);
    }
}
