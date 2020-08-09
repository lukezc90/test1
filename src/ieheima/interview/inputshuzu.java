package ieheima.interview;

import java.util.Arrays;
import java.util.Scanner;

public class inputshuzu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b[] = new int[3];
        for(int a=0;a<b.length;a++){
            b[a] = scanner.nextInt();
//            System.out.println(b[a]+"");
        }
        System.out.println(Arrays.toString(b));

    }
}
