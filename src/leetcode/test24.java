package leetcode;

/*
在旋转过的有序数组中寻找目标值
数组int[] length, 字符串 s length()
描述:
输入：[6,8,10,0,2,4],10    返回值：2
输入：[6,8,10,0,2,4],3  返回值：-1
 */
public class test24 {
    public int search(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
