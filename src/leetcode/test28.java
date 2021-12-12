package leetcode;

import java.util.*;

/*
罗马数字转化为整数
输入："MCMXCVI"   返回值：1996
 */
public class test28 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans = 0;
        int preValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = map.get(s.charAt(i));
            if (curValue < preValue)
                ans -= curValue;
            else
                ans += curValue;
            preValue = curValue;

        }
        return ans;

    }
}
