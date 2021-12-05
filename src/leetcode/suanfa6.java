package leetcode;

/*
https://leetcode-cn.com/problems/sqrtx/solution/x-de-ping-fang-gen-by-leetcode-solution/

平方根
 */
public class suanfa6 {
    public static int sqrt(int n){
        int left = 0;
        int right = n;
        int mid = (left + right)/2;
        while(right>left){
            if(mid*mid > n){
                right = mid -1;
            }else if(mid*mid < n){
                left = mid +1;
            }else {
                return mid;
            }
        }
        return -1;

    }
}
