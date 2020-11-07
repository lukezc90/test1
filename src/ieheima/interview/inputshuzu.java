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
        for(int i=0;i<b.length-1;i++){
            for(int j=0;j<b.length-i-1;j++){
                if(b[j]>b[j+1]){
                    int tmp = b[j];
                    b[j]=b[j+1];
                    b[j+1]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(b));

    }
}
