package org.example.commonlyusedclass;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringDemo {
    public static void main(String[] args) {
        /**
         * 字符串
         */
        String a = "ad汉sfadsf";
        System.out.println(a.charAt(0));
        //new sun.nio.cs.UTF_8();
        Charset.forName("UTF-16");
        Charset charset = StandardCharsets.UTF_8;
        new String(new byte[]{123}, StandardCharsets.UTF_8);
        Object x[];
/*        if (a.equals(x[0])) {

        }*/

        System.out.println(a.codePointAt(2));
        System.out.println((char)('b'+'a'));
        System.out.println((char) a.codePointBefore(3));
        System.out.println("codePointCount:"+a.codePointCount(1, 4));
        System.out.println(a.compareTo("zsaf"));
        String chara = String.copyValueOf(new char[]{'a', 'b', 'c'});
        System.out.println(chara);
        System.out.println(Math.round(-4.5));


    }

}
