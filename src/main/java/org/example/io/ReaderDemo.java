package org.example.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ReaderDemo {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("aaa");
            Writer writer = new FileWriter("bbb");
            int a = reader.read();
            System.out.println((char)a);
            writer.write(a);
            System.out.println((int)a);
            FileInputStream fileInputStream = new FileInputStream("aaa");
            byte[] b = new byte[1024];
            int n;
            while ((n = fileInputStream.read(b)) != -1){
                System.out.println(new String(b,0,n));
            }

            for (byte aByte : "马".getBytes(StandardCharsets.UTF_16)) {
                System.out.println(new Byte(aByte));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
