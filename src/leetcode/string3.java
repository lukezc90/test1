package leetcode;

/*
字符串中的第一个唯一字符
给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class string3 {
    public int firstUniqChar(String s){
        int i,j;
        char[] c=s.toCharArray();
        for(i=0;i<c.length;i++){
            for(j=0;j<c.length;j++){
                if(c[i]==c[j]&&i!=j){
                    break;
                }
            }
            if(j==c.length){
                return i;
            }
        }
        return -1;
    }
}
