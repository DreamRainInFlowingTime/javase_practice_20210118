package org.example;

public class LeecodeTest {
    public static void main(String[] args) {
        //System.out.println((-205)%10);
        String a = "";
        String b[] = a.split("as");
        for (String s : b) {
            System.out.println(s);
        }
        System.out.println(a.startsWith("as", 2));
        int x;
        x=1;
        for (int i = 0; i < 5; i++) {
            x = 9;
            for (int j = 0; j < 3; j++) {
                x = 8;
            }
        }
        System.out.println(x);
        System.out.println(a.substring(0,0));

        char[] chara = new char[]{'q','w'};
        System.out.println(String.valueOf(chara, 0, 1));


    }
    }

