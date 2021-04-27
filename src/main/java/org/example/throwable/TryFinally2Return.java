package org.example.throwable;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class TryFinally2Return {
    public static void main(String[] args) {
        System.out.println(test());

    }
    static int test(){
        try{
            System.out.println("i am try");
            //return 1;
            throw new Exception();


        }catch (Exception e){
            System.out.println("i am catch");
            //o 因为是system.err所以输出在下面
            e.printStackTrace();
            System.out.println("i am catch2");

        }finally {
            System.out.println("i am finally");
            int x = 1/0;
            return 2;
        }
    }
}
