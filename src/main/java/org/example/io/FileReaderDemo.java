package org.example.io;

import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) {
        File file = new File("aaa");
        try {
/*            FileReader fileReader = new FileReader(file);
            int n;
            while ((n = fileReader.read()) != -1){
                System.out.println((char) n);
            }*/
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(-1);
           // fileWriter.flush();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
