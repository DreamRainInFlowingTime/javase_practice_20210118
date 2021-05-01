package org.example.throwable;


import java.io.IOException;

/**
 * try语句在返回前，将其他所有的操作执行完，保留好要返回的值，而后转入执行finally中的语句
 *  fianlly中如果有return就会直接执行finally中的return
 *  fianlly中如果没有return，此时如果finally改变了要返回的值：
 *  1）如果return的数据是基本数据类型或文本字符串，则在finally中对该基本数据的改变不起作用，try中的return语句依然会返回进入finally块之前保留的值。
 *  2）如果return的数据是引用数据类型，而在finally中对该引用数据类型的属性值的改变起作用，try中的return语句返回的就是在finally中改变后的该属性的值。
 *
 *  像x+=1这种底层会拆开
 *
 *  finally中有错误会停止程序，抛给jvm
 */

public class TryFinally2Return {
    static int x = 2;
    public static void main(String[] args) throws MyException {

        System.out.println(test());
        //throw new MyException("自定义异常");

    }
    static int test(){
        try{
            System.out.println("i am try");
            x+=3;
            int a = 5;
            //System.exit(0);
            //return x;
        }catch (Exception e){
            System.out.println("i am catch");
            //o 因为是system.err所以输出在下面
            e.printStackTrace();
            System.out.println("i am catch2");


        }finally {
            System.out.println("i am finally");
            x=10;
            //int x = 1/0;
            //return 2;
        }
        System.out.println(x);
        //return 0;
        return 0;
    }
}
