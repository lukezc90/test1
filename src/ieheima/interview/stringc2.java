package ieheima.interview;

import java.util.Scanner;

public class stringc2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            char[] as = str.toCharArray();
            StringBuffer bs = new StringBuffer("");
//            boolean flag = true;
            for (int i = 0; i < as.length-1; i++) {
                if (as[i] == as[i+1]) {
                    continue;
                }else {
                    bs.append(as[i]);
                }
//                bs.append(as[i]);
            }
            if(as[as.length-2]!=as[as.length-1]){
                bs.append(as[as.length-1]);
            }

            System.out.println(bs);

        }
    }

