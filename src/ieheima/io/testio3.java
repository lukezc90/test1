package ieheima.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testio3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("learn\\1.txt");
//        FileOutputStream fos2 = new FileOutputStream("learn\\2.txt",true);
        for(int i =0;i<=10;i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
