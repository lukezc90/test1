package ieheima.io;

import java.io.*;

public class testio9 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\learn\\1.txt"));

        bos.write("hello".getBytes());
        bos.write("world".getBytes());

        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\learn\\1.txt"));

        byte[] by = new byte[1024];
        int len;
        while ((len=bis.read(by))!=-1){
            System.out.print(new String(by,0,len));
        }
    }
}
