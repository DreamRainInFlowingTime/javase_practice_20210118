package org.example.io;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        char a = Character.MAX_VALUE;
        char b = '马';
        //System.out.println(Integer.toBinaryString(b));
        System.out.println((int)b);
        for (byte aByte : "马".getBytes(StandardCharsets.UTF_8)) {
            System.out.println(Integer.toBinaryString(Byte.toUnsignedInt(aByte)));

        }
    }
}
