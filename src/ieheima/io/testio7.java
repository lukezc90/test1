package ieheima.io;

import java.io.FileInputStream;
import java.io.IOException;


/*
    读取
 */
public class testio7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\learn\\1.txt");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys))!= -1){
            System.out.println(new String(bys,0,len));
        }

        fis.close();
    }
}
