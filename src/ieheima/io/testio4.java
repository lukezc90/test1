package ieheima.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class testio4 {
    public static void main(String[] args) {

        FileOutputStream fos=null;
        try {
            fos = new FileOutputStream("D:\\learn\\1.txt");

            fos.write("abc".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
