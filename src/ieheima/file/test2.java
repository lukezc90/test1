package ieheima.file;

import java.io.File;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\idea activity\\java.txt");
//        System.out.println(f1.createNewFile());

        File f2 = new File("D:\\idea activity\\javase");
//        System.out.println(f2.mkdir());

        File f3 = new File("D:\\idea activity\\test1\\test2");
        System.out.println(f3.mkdirs());
    }
}
