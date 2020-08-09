package ieheima.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class test1 {
    public static void main(String[] args)throws IOException {
        //创建一个写入指定OutputStream的ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\learn\\3.txt"));

        //创建对象
    }
}
