package org.example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

/*

 */
public class Main {
    String a ;



    public static void main(String[] args) {
        String q;
        long a = 1;
        final int DA;
        int main = 5;
        int b = 2;
        byte c = 127;
        int[] x = new int[10];
        int[] x1 = new int[10];
        x[0] = 3;
        //System.out.println(++b);
        //System.out.println(b++);
        //System.out.println(++b+b++);
        byte d = 10;
        //System.out.println(Byte.toUnsignedInt((byte) -2));
        System.out.println((byte)c & 0xff);
        System.out.println((123.0/3));
        System.out.println(Arrays.equals(x,x1));
        int[] copyX = Arrays.copyOfRange(x1, 0, 12);
        System.out.println(Arrays.toString(copyX));
        System.out.println(a);
        String e = "1";
        String s = new String("2");
        System.out.println(s.indexOf(""));
        //System.out.println(new BigDecimal("0.2").add(new BigDecimal("0.1")));

        byte   aByte = 2;
        long l = 465;
        int xx = 12;
        long aaa = 31L;
        //System.out.println(aByte<<aaa);
        String o = "dsfsd";
        Date date = new Date();
        Date date2 = new Date();
        Date[] date3 = new Date[]{date,date2};
        System.out.println(String.format("%te%tY", date3));
        StringBuilder stringBuilder = new StringBuilder(4);
        System.out.println(stringBuilder.capacity());
        stringBuilder.append("dsadd");
        //stringBuilder.append("l");
        System.out.println(stringBuilder.capacity());


    }
}
