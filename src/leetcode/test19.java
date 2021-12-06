package leetcode;
/*
https://leetcode-cn.com/problems/is-subsequence/solution/pan-duan-zi-xu-lie-by-leetcode-solution/
判断子序列
我们初始化两个指针 ii 和 jj，分别指向 ss 和 tt 的初始位置。每次贪心地匹配，匹配成功则 ii 和 jj 同时右移，匹配 ss 的下一个位置，匹配失败则 jj 右移，ii 不变，尝试用 tt 的下一个字符匹配 ss。
最终如果 ii 移动到 ss 的末尾，就说明 ss 是 tt 的子序列

 */

public class test19 {
    public boolean isSubsequence(String s,String t){
        int n = s.length(),m=t.length();
        int i=0,j=0;
        while(i<n&&j<m){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }else {
                j++;
            }
        }

        return i==n;
    }
}
