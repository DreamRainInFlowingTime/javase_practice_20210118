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
    static int x = 1;

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
    void test(String p){
        class MethodInnerClass {

        }

        /**
         * 匿名内部类
         * ?原来不是形参可以不是final么
         */
        new InnerClassTest(){
            {
                a = 5;
                b = "4";
                b = "3";
                System.out.println(InnerClassTest.this.b);
                System.out.println(a);
                System.out.println(p);

            }
        };

    }


    /**
     * 静态内部类
     */

    static class StaticInnerClass{
        static int a = 9;

        public StaticInnerClass(String s) {

        }

        void test(){

        }

    }


    public static void main(String[] args) throws InterruptedException {
       // InnerClassTest.StaticInnerClass()
/*        while(true){
            System.out.println("1");
            Thread.sleep(1000);
        }*/
        new InnerClassTest.StaticInnerClass("1").test();
        new InnerClassTest().new MemberInnerClass();
        int a = new InnerClassTest.StaticInnerClass("2").a;
    }

}
