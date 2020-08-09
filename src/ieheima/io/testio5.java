package ieheima.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class testio5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fos = new FileInputStream("D:\\learn\\1.txt");

        int by;
        while ((by = fos.read())!=-1){
            System.out.print((char)by);
        }


        fos.close();
    }
}
