package org.example.inheritance;

import org.example.throwable.ThrowableTest;

/**
 * 1、测试一下，父类中的private是否可以用super访问，应该是不可以的-->确实不可以
 * 2、子类父类不在同一个包下，默认权限不可以访问到，protect可以。
 * 3、父类有main子类不写main可以运行，说明子类继承了。
 * 4、静态方法不可以被重写。
 * 5、super和this不能调用静态方法，奇怪啊,实际是可以的，只是idea没提示。
 * 6、关于静态方法不能被重写到底是缺陷还是优点?没弄明白。。。
 *
 */
public class Dad extends ThrowableTest {
    private int a = 1;
    int b = 2;

    public Dad() {
        System.out.printf(a+"");
        this.a = 3;
    }

    public void superTest(){
        System.out.printf("", super.a);
        ThrowableTest.d();
        ThrowableTest.d();



    }
    static void superTestStatic(){
    }

    public static void main(String[] args) {
        Dad dad = new Dad();
        dad.superTestStatic();
    }



}