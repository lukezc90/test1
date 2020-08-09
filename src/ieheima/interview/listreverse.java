package ieheima.interview;

import java.util.Scanner;

public class listreverse {
    public static void main(String[] args) {
        int m,n;
        System.out.println("请输入一个5位数:");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        int a,b,c,d,e;
        a = m/10000;
        b = m/1000%10;
        c = m/100%10;
        d = m/10%10;
        e = m%10;
        n = e*10000+d*1000+c*100+b*10+a;
        System.out.println("逆序输出结果:"+ n);
    }
}
