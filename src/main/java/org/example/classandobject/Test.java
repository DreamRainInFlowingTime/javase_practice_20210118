package org.example.classandobject;



public class Test {
    static char b;
    public  int a;
    public Test(){
        System.out.printf("111");

    }
    public Test(String a){
        this();
        System.out.printf("333");
    }

    public static void main(String[] args) {
        System.out.printf(new Test().a+"");
        System.out.printf("222\n");
        System.out.println(b+"");
    }


}
