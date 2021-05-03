package org.example.debug;
import java.util.HashMap;
import java.util.Map;

public class DebugDemo {
    static Integer a = 5;
    public static void main(String[] args) {
        test();
        Map map = new HashMap();
        map.put("1", "123");
        map.put("2", "a");
        map.put("3", "b");
        map.put("4", "c");
        map.put("5", "d");
        System.out.println(a);
    }
    static void test() {
        test1();
        System.out.println("test");


    }
    static int test1() {
        for (int i = 0; i < 10; i++) {
            a += 10;
        }
        return a;
    }
}
