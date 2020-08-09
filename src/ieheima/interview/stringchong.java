package ieheima.interview;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class stringchong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] as=str.toCharArray();
        StringBuffer bs=new StringBuffer("");
        boolean flag=true;
        for(int i=0;i<as.length;i++){
            for(int j=i;j<as.length;j++) {
                if (i == j) {
                    continue;
                }
                if (as[i] == as[j]) {
                    flag = false;
//                    break;
                }
            }
            if(flag) {
                    bs.append(as[i]);
                }
            flag = true;

        }
        System.out.println(bs);
    }
}
