package ieheima.interview;



//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.*;
//import java.util.Scanner;

/*
快手字符串排序题
 */
public class test11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String m = in.nextLine();
        int[] arr = new int[m.length()];
        for(int i=0;i<m.length();i++){

            String lasts = m.substring(m.length()-6);
            arr[i] = Integer.parseInt(lasts);

        }
        Arrays.toString(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
