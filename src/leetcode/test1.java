package leetcode;

import java.util.*;

/*
字符串，统计字符串中字符出现次数
 */
public class test1 {


    public static void main(String[] args) {
        String s = "aaadlkfjlsajbdfjkal";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
//        char count =' ';
//        int maxx =0;
        for(int i =0;i<s.length();i++){

            if(map.containsKey(s.charAt(i))){
//                count = s.charAt(i);
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
//                maxx = Math.max(maxx,map.get(s.charAt(i)));

            }else {
                map.put(s.charAt(i),1);
            }
        }

        Integer max = Collections.max(map.values());
        Set<Character> set = new HashSet<Character>();
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()==max){
                set.add(e.getKey());
            }
        }
        System.out.println("出现次数最多的字母为："+set+" 最多出现次数为"+max);

    }
}
