package reflect;

public class GetClassTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = new B();
        System.out.println(a.getClass() + " " + A.class);
        System.out.println(b.getClass() + " " + B.class);
        System.out.println(ab.getClass());
        ab = a;
        System.out.println(ab.getClass());
    }
}
class A {
    public void func() {
    }
}

class B extends A {
}

