package org.example.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("aaa");
            int a = reader.read();
            System.out.println((char)a);
            System.out.println((int)a);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
