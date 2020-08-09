package ieheima.interview;

import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year=in.nextInt();
        if(year<=0||year>9999){
            System.out.println("请输入准确的年份");

        }
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println("闰年");
        }else {
            System.out.println("不是闰年");
        }

    }
}
