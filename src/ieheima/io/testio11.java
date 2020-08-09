package ieheima.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class testio11 {
    public static void main(String[] args)throws IOException {
//        FileInputStream fis = new FileInputStream("D:\\learn\\2.txt");
//        int by;
//        while ((by = fis.read())!=-1){
//            System.out.println((char)by);
//        }



        String s ="abc";
        byte[] bys = s.getBytes();
        System.out.println(Arrays.toString(bys));
    }
}
