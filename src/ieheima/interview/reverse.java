package ieheima.interview;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        System.out.println(str);
        int i = str.length();
        for(int j= i-1;j>=0;j--){
            System.out.print(str.charAt(j));
        }




    }
}
