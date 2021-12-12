package leetcode;

/*
最长公共前缀
输入：["abca","abc","abca","abc","abcc"]  返回值："abc"
输入：["abc"] 返回值："abc"
 */
public class test27 {
    public String longestCommonPrefix(String[] strs){

        if(strs.length==0&&strs==null){
            return "";
        }
        int rows =strs.length;
        int cols =strs[0].length();
        for(int i=0;i<cols;i++){
            char c = strs[0].charAt(i);
            for(int j=1;j<rows;j++){
                if(c!=strs[j].charAt(i)||strs[j].length()==i){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
