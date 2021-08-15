package leetcode;
/*
https://leetcode-cn.com/problems/climbing-stairs/solution/pa-lou-ti-by-leetcode-solution/

 */
public class suanfa5 {
    public static int climb(int n){
        int p=0;
        int q=0;
        int r=1;
        for(int i=1;i<=n;++i){
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }


}
