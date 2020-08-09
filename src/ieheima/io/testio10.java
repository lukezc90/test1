package ieheima.io;

import java.io.*;

public class testio10 {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long starttime =System.currentTimeMillis();

        //复制视频
        method1();
        method2();

        //记录结束时间
        long endtime =System.currentTimeMillis();
        System.out.println("共耗时："+ (endtime-starttime) + "毫秒");
    }

    //基本字节流一次读写一个字节
    public static void method1()throws IOException{
        FileInputStream fis = new FileInputStream("D:\\learn\\2.txt");
        FileOutputStream fos = new FileOutputStream("D:\\learn\\3.txt");

        int by;
        while ((by = fis.read())!=-1){
            fos.write(by);
        }

        fis.close();
        fos.close();
    }
    //基本字节流一次读写一个数组  2
    public static void method2()throws IOException{
        FileInputStream fis2 = new FileInputStream("D:\\learn\\2.txt");
        FileOutputStream fos2 = new FileOutputStream("D:\\learn\\3.txt");

        byte[] byt = new byte[1024];
        int len;
        while ((len=fis2.read(byt))!=-1){
            fos2.write(byt,0,len);
        }

        fis2.close();
        fos2.close();
    }
    //字节缓冲流一次读写一个字节  3
    public static void method3()throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\learn\\2.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\learn\\2.txt"));

        int b;
        while ((b = bis.read())!=-1){
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
    //字节缓冲流一次读写一个字节数组  1
    public static void method4()throws IOException{
        BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("D:\\learn\\2.txt"));
        BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream("D:\\learn\\2.txt"));

        byte[] byt2 = new byte[1024];
        int len2;
        while ((len2 = bis2.read(byt2))!=-1){
            bos2.write(byt2,0,len2);
        }

        bis2.close();
        bos2.close();
    }
}
