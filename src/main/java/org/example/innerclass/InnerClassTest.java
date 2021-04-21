package org.example.innerclass;

/**
 * 四种都试一下哈，顺便区分一下：
 *  成员内部类
 *      变量名字相同的时候，想用外部类的需要用InnerClassTest.this
 *  方法内部类
 *  匿名内部类
 *  静态内部类
 */
public class InnerClassTest {
    int a = 1;
    String  b = "2";

    /**
     * 成员内部类
     */
    class MemberInnerClass {
        int a = 2;

         void test(){
             System.out.println(InnerClassTest.this.a+"");
             b = "3";
         }

    }

    /**
     * 方法内部类
     */
    void test(){
        class MethodInnerClass {

        }

        /**
         * 匿名内部类
         */
        new InnerClassTest(){
            void InnerMethod(){

            }
        };

    }


    /**
     * 静态内部类
     */

    static class StaticInnerClass{

    }

    public static void main(String[] args) {
        new InnerClassTest().new MemberInnerClass().test();
    }


}
