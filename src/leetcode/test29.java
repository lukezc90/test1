package leetcode;
/*
数字变成罗马数字
输入：1   返回值："I"
 */
public class test29 {
    public String intToRoman(int num){
        StringBuffer sb = new StringBuffer();
        int[] s={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] st= {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        for(int i=s.length-1;i>=0;){
            if(num>s[i]){
                sb=sb.append(st[i]);
                num -=s[i];
            }else {
                i--;
            }
        }
        return sb.toString();
    }
}
