package org.example.commonlyusedclass;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringDemo {
    public static void main(String[] args) {
        /**
         * 字符串
         */
        String a = "adsfadsf";
        System.out.println(a.charAt(0));
        //new sun.nio.cs.UTF_8();
        Charset.forName("UTF-16");
        Charset charset = StandardCharsets.UTF_8;
        new String(new byte[]{123}, StandardCharsets.UTF_8);
        Object x[];
/*        if (a.equals(x[0])) {

        }*/





    }

}
