package leetcode;

/*
整数反转
给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 */
public class string2 {
    public int reverse(int x){
        int res = 0;
        while(x !=0){
            int t = x %10;
            int newRes = res * 10 + t;
            //如果数字溢出，直接返回0
            if((newRes - t)/10 != res){
                return 0;
            }
            res = newRes;
            x = x / 10;
        }
        return res;
    }
}
