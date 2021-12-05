package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode-cn.com/problems/roman-to-integer/solution/luo-ma-shu-zi-zhuan-zheng-shu-by-leetcod-w55p/
罗马数字转整数
 */
public class suanfa13 {
    Map<Character,Integer> symbolValues = new HashMap<Character,Integer>() {
        {
        put('I',1);
        put('V',5);
        put('X',10);
        put('L',50);
        put('C',100);
        put('D',500);
        put('M',1000);
    }
    };
//
//    public int romanToInt(String s){
//        int ans = 0;
//        int n = s.length();
//        for(int i =0;i<n;i++){
//            int value = symbolValues.get(s.charAt(i));
//
//            if(i<n-1&&value<symbolValues.get(s.charAt(i+1))){
//                ans
//            }
//        }
//    }
}
