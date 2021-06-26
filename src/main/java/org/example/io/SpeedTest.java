package org.example.io;

import org.junit.BeforeClass;

import java.io.*;

public class SpeedTest {
    public static final String PATH = "";

    /**
     * 用于输出的对象
     */
    public static byte[] outputbytes = null;

    public static char[] outputchars = null;

    int count = 1;

    /**
     * 用于输入的对象
     */
    public static final File inputFile = new File("speed.txt");


    @BeforeClass
    public static void before() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("stringstringstringstringstringstring");
        }
        outputbytes = stringBuilder.toString().getBytes();
        outputchars = stringBuilder.toString().toCharArray();
    }



    public void test0() {
        System.out.println("--------------------------------------------------------");
        System.out.println("                      测试输出流                          ");
        System.out.println("--------------------------------------------------------");
    }


    // 字节流

    public void test1() {
        try {
            System.out.println("********方式一：字节流输出**********");
            // 新建文件命名
            String name = PATH + "字节流输出文件.txt";
            File file = new File(name);
            // 创建输入输出流对象
            FileOutputStream fos = new FileOutputStream(file);
            // 读写数据
            long s1 = System.currentTimeMillis();// 测试开始，计时
            //writeBytes(fos);
            fos.write(outputbytes,0,outputbytes.length);
            long s2 = System.currentTimeMillis();// 测试结束，计时
            fos.close();
            System.out.println("输出文件耗时：" + (s2 - s1) + "ms");
            System.out.println("文件大小：" + file.length() / 1024 + "KB");
            file.delete();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }


    // 字节流

    public void test2() {
        try {
            System.out.println("********方式二：字符流输出**********");
            // 新建文件命名
            String name = PATH + "字符流输出文件.txt";
            File file = new File(name);
            // 创建输入输出流对象
            FileWriter fileWriter = new FileWriter(file);
            // 读写数据
            long s1 = System.currentTimeMillis();// 测试开始，计时
            //writeChars(fileWriter);
            fileWriter.write(outputchars,0,outputchars.length);
            long s2 = System.currentTimeMillis();// 测试结束，计时
            fileWriter.close();
            System.out.println("输出文件耗时：" + (s2 - s1) + "ms");
            System.out.println("文件大小：" + file.length() / 1024 + "KB");
            file.delete();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // 字节缓冲流
    public void test3() {
        try {
            System.out.println("********方式三：字节缓冲流输出**********");
            // 新建文件命名
            String name = PATH + "字节缓冲流输出文件.txt";
            File file = new File(name);
            // 创建输入输出流对象
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            // 读写数据
            long s1 = System.currentTimeMillis();// 测试开始，计时
            //writeBytes(bufferedOutputStream);
            bufferedOutputStream.write(outputbytes,0,outputbytes.length);
            //bufferedOutputStream.write(outputbytes);
            long s2 = System.currentTimeMillis();// 测试结束，计时
            bufferedOutputStream.close();
            System.out.println("输出文件耗时：" + (s2 - s1) + "ms");
            System.out.println("文件大小：" + file.length() / 1024 + "KB");
            file.delete();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // 字符缓冲流

    public void test4() {
        try {
            System.out.println("********方式四：字符缓冲流输出**********");
            // 新建文件命名
            String name = PATH + "字符缓冲流输出文件.txt";
            File file = new File(name);
            // 创建输入输出流对象
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            // 读写数据
            long s1 = System.currentTimeMillis();// 测试开始，计时
            //for (int i = 0; i < count; i++) {
             //   bufferedWriter.write(outputchars);
            //}
            bufferedWriter.write(outputchars,0,outputchars.length);
            long s2 = System.currentTimeMillis();// 测试结束，计时
            bufferedWriter.close();

            System.out.println("输出文件耗时：" + (s2 - s1) + "ms");
            System.out.println("文件大小：" + file.length() / 1024 + "KB");
            file.delete();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void test5() {
        System.out.println("--------------------------------------------------------");
        System.out.println("                      测试输入流                          ");
        System.out.println("--------------------------------------------------------");
    }


    // 字节流

    public void test6() {
        try {
            System.out.println("********方式一：字节流输入**********");
            // 新建文件命名
            // 创建输入输出流对象
            long s1 = System.currentTimeMillis();// 测试开始，计时
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            // 读写数据
            // 读写数据
            while (fileInputStream.read() != -1) {
            }
            fileInputStream.close();
            long s2 = System.currentTimeMillis();// 测试结束，计时
            System.out.println("输入文件耗时：" + (s2 - s1) + "ms");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 字节流

    public void test7() {
        try {
            System.out.println("********方式二：字符流输入**********");
            // 新建文件命名
            long s1 = System.currentTimeMillis();// 测试开始，计时
            // 创建输入输出流对象
            FileReader fileReader = new FileReader(inputFile);
            // 读写数据
            while (fileReader.read() != -1) {
            }
            fileReader.close();
            long s2 = System.currentTimeMillis();// 测试结束，计时
            System.out.println("输入文件耗时：" + (s2 - s1) + "ms");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 字节缓冲流

    public void test8() {
        try {
            System.out.println("********方式三：字节缓冲流输入**********");
            // 新建文件命名
            long s1 = System.currentTimeMillis();// 测试开始，计时
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inputFile));
            // 创建输入输出流对象
            // 读写数据
            while (bufferedInputStream.read() != -1) {
            }
            bufferedInputStream.close();
            long s2 = System.currentTimeMillis();// 测试结束，计时
            System.out.println("输入文件耗时：" + (s2 - s1) + "ms");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // 字符缓冲流

    public void test9() {
        try {
            System.out.println("********方式四：字符缓冲流输入**********");
            // 新建文件命名
            long s1 = System.currentTimeMillis();// 测试开始，计时
            // 创建输入输出流对象
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            // 读写数据
            while (bufferedReader.read() != -1) {
            }
            bufferedReader.close();
            long s2 = System.currentTimeMillis();// 测试结束，计时
            System.out.println("输入文件耗时：" + (s2 - s1) + "ms");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * 字节输出
     */
    private void writeBytes(OutputStream fos) throws IOException {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < outputbytes.length; j++) {
                fos.write(outputbytes[j]);
            }
        }
    }

    /**
     * 字符输出
     */
    private void writeChars(Writer writer) throws IOException {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < outputchars.length; j++) {
                writer.write(outputchars[j]);
            }
        }
    }

    public static void main(String[] args) {
        SpeedTest speedTest = new SpeedTest();
        before();
        speedTest.test0();
        speedTest.test1();
        speedTest.test2();
        speedTest.test3();
        speedTest.test4();
    }

}
