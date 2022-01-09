package leetcode;

import java.util.Scanner;

/*
判断字符串是否对称
 */
public class test32 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int flag= 0;
        for(int i=0;i<str.length()/2;i++){
            if(str.substring(i,i+1).equals(str.substring(str.length()-1-i,str.length()-i))){
                continue;
            }
            else{
                flag++;
                break;
            }
        }
        if(flag !=0){
            System.out.println("字符串非对称");
        }else{
            System.out.println("字符串对称");
        }
    }
}
