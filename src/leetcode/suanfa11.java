package leetcode;

/*
https://leetcode-cn.com/problems/maximum-subarray/solution/hua-jie-suan-fa-53-zui-da-zi-xu-he-by-guanpengchn/

 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
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
