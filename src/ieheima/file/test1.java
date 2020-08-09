package ieheima.file;

import java.io.File;

public class test1 {
    public static void main(String[] args) {
        File f1 = new File("D:\\idea activity\\0202.txt");
        System.out.println(f1);

        File f2 = new File("D:\\idea activity","0202.txt");
        System.out.println(f2);

        File f3 = new File("D:\\idea activity");
        File f4 = new File(f3,"0202.txt");
        System.out.println(f4);
    }
}
