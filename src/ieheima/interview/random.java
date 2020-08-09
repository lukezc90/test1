package ieheima.interview;

import java.io.*;
import java.util.Random;

public class random {
    public static void main(String[] args) throws IOException {

        BufferedWriter bws = new BufferedWriter(new FileWriter("D:\\learn\\3.txt"));
        Random random = new Random();
        int num =random.nextInt(19999);
        System.out.println(num);
        bws.write(Integer.toString(num));

        bws.close();
//        System.out.println(num);

//        for(int i=1;i<=20000;i++){
//            int num =random.nextInt();
//            System.out.println(num);
//        }
    }
}
