package org.example.innerclass;

/**
 * 四种都试一下哈，顺便区分一下：
 *  成员内部类
 *  方法内部类
 *  匿名内部类
 *  静态内部类
 */
public class InnerClassTest {

    /**
     * 成员内部类
     */
    class MemberInnerClass {

    }

    /**
     * 方法内部类
     */
    void test(){
        class MethodInnerClass {

        }
    }

    /**
     * 匿名内部类
     */



    /**
     * 静态内部类
     */

    public static void main(String[] args) throws InterruptedException {
        while(true){
            System.out.println("1");
            Thread.sleep(1000);
        }
    }

}
