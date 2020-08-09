package ieheima.interview;

import java.util.Scanner;

public class ipaddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ipstr = scanner.next();
        boolean isipLegal = isipLegal(ipstr);
        if(isipLegal){
            System.out.println(ipstr+"合法");
        }
        else {
            System.out.println(ipstr+"非法");
        }


    }

    public static boolean isipLegal(String str){
        //检查ip是否为空
        if(str==null){
            return  false;
        }
        //检查ip长度，最短为：x.x.x.x(7位)，最长为：xxx.xxx.xxx.xxx(15位)
        if(str.length()<7||str.length()>15){
            return  false;
        }
        //对输入字符串的首末字符判断，如果是"."则是非法IP
        if(str.charAt(0)=='.'||str.charAt(str.length()-1)=='.'){
            return  false;
        }
        //按"."分割字符串，并判断分割出来的个数，如果不是4个，则是非法IP
        String[] arr=str.split("\\.");
        if(arr.length!=4){
            return  false;
        }
        //对分割出来的每个字符串进行单独判断
        for(int i =0;i<arr.length;i++){
            //如果每个字符串不是一位字符，且以'0'开头，则是非法的IP，如：01.002.03.004
            if(arr[i].length() > 1 && arr[i].charAt(0) == '0'){

                return false;
        }
    }
        //对每个字符串的每个字符进行逐一判断，如果不是数字0-9，则是非法的IP
        for(int j = 0; j < arr[4].length(); j++){
            if (arr[4].charAt(j) < '0' || arr[4].charAt(j) > '9'){
                return false;
            }
        }
        for(int i = 0; i < arr.length; i++){
            int temp = Integer.parseInt(arr[i]);
            if(i == 0){
                if (temp < 1 || temp > 255){
                    return false;
                }
            }
            else{
                if(temp < 0 || temp > 255){
                    return false;
                }
            }
        }
        return true;
    }
}

