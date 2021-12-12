package leetcode;

/*
在旋转过的有序数组中寻找目标值
数组int[] length, 字符串 s length()
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
