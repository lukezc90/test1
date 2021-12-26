package leetcode;

/*
描述
给定2个字符串s1和s2，请判断s2是否为s1旋转而成，返回bool值。字符串中字符为英文字母和空格，区分大小写，字符串长度小于等于1000
 */
public class test31 {
    public boolean checkReverseEqual(String s1, String s2) {
        // write code here

        if(s1.length()!=s2.length())
            return false;
        String str=s1+s1;
        if(str.contains(s2))
            return true;
        return false;
    }
}
