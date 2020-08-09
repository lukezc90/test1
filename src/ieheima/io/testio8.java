package ieheima.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class testio8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\惠普-1\\原版照片\\2寸.jpg");

        FileOutputStream fos =new FileOutputStream("D:\\learn\\pic.jpg");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys))!= -1){
            fos.write(bys,0,len);

        }
        fis.close();
        fos.close();
    }
}
