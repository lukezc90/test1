package ieheima.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class testio6 {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\learn\\1.txt");

        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\learn\\2.txt");

        //读写数据，创建文本文件（一个读取，一个写入）
        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }

        fis.close();
        fos.close();
    }
}
