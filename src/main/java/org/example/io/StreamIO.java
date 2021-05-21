package org.example.io;



import java.io.*;
import java.util.Arrays;

public class StreamIO {
    public static void main(String[] args) {
/*        try {
            //OutputStream outputStream = new FileOutputStream("aaa");
            //outputStream.write(-1);
            //char a = -1;
            Writer writer = new FileWriter("aaa");
            writer.write(-1);
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            InputStream inputStream = new FileInputStream("aaa");
            //byte[] b = new byte[1024];
            int length;
            int read;
            byte[] b = new byte[1024];
            char[] c = new char[1024];
           while ((read = inputStream.read())!=-1){
                System.out.println(Integer.toBinaryString(read));
            }
            System.out.println("------");
            InputStream inputStream1 = new FileInputStream("aaa");
            Reader reader = new FileReader("aaa");
            OutputStream outputStream = new FileOutputStream("bbb");
            while ((length = inputStream1.read(b))!=-1){
                System.out.println(Arrays.toString(b));
                outputStream.write(b);
                outputStream.flush();
                System.out.println(new String(b, 0, length));

            }
            while ((length = reader.read())!=-1){
                System.out.println(Integer.toBinaryString(length));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }


    }
}
