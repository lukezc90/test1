package ieheima.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testio2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("learn\\1.txt");

        File file = new File("learn\\2.txt");
        FileOutputStream fos2 = new FileOutputStream(file);

        byte[] byt = {97,98,99,100,101};
        fos.write(byt);

        //byte byt2 = "abcde".getBytes();
        //fos.write(byt2);
        //fos.write(byt2,1,3);

    }
}
