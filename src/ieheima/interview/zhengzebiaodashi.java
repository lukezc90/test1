package ieheima.interview;

import java.util.Scanner;

public class zhengzebiaodashi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //用正则表达式 替换  非数字 字符  在用 split 分割 得到 字符串数组
        String ss[]=str.replaceAll("[^0-9]",",").split(",");
        int maxsize =0;
        String res="";
        for(int i=0;i<ss.length;i++){
            if(ss[i].length()>maxsize){
                maxsize = ss[i].length();
                res = ss[i];
            }
        }
        System.out.println(res);
    }
}
