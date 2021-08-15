package leetcode;

/*
https://leetcode-cn.com/problems/maximum-subarray/solution/hua-jie-suan-fa-53-zui-da-zi-xu-he-by-guanpengchn/
 */
public class suanfa11 {
    public int maxSubArray(int[]  nums){
        int ans =nums[0];
        int sum =0;
        for(int a:nums){
            if(sum > 0){
                sum += a;
            }else{
                sum = a;
            }
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}
