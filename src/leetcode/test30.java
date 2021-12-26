package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
 * String str1 = "abcabcdebb"
 */
public class test30 {
    public int Longstring(String s){
        int num=0;//记录最长子串长度
        int current=0;//记录当前子串长度
        char[] a = s.toCharArray();
        List<Character> list =new ArrayList<>();
        if(a.length == 0) {
            return 0;
        }else{
            for(int i =0;i<a.length;i++){
                if(!list.contains(a[i])){
                    list.add(a[i]);
                    current=list.size();
                    if(current>num){
                        num = current;
                    }
                }
                else {
                    list.add(a[i]);
                    int first=list.indexOf(a[i]);

                    list.remove(first);
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String str1 = "abcabcdebb";
        test30 c = new test30();
        System.out.println(c.Longstring(str1));
    }
}
