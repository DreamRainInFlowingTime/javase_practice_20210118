package org.example.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("a/b/c");
        System.out.println(file.getAbsolutePath());
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
