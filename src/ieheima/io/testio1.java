package ieheima.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testio1 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("learn\\fox.txt");
        /*
            做了三件事
               1 调用系统功能创建了文件
               2 创建了字节输出流对象
               3 让字节输出流对象指向创建好的文件
         */
        fos.write(97);

        //最后都要释放资源
        fos.close();
    }
}
