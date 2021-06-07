import org.example.gc.LocalVarGCTest;
import org.example.inheritance.Dad;

import java.awt.print.PrinterGraphics;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    int x= 1;
    Dad dad = new Dad();
    public static void main(String[] args) {
        int x = 2;
        System.out.println("args = " + Arrays.deepToString(args));

        System.out.println("123");

        double a  = 1.31531515313515423423432423432423324324324234243243242342343223432235435345435433324234f;
        System.out.println(a);
        Integer integer = null;
        System.out.println(integer);
        System.out.println("珊电动阀\r");
        int[][] aa = new int[3][];
        //byte x = 2+aa;
        byte by = -1;
        System.out.println(by & 1);
        char b = '珊';
        System.out.println(Arrays.toString(new String[]{Character.toString(b)}));
        new Dad();
        System.out.println("----");

    }



}
