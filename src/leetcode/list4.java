package leetcode;
/*
两数之和 II - 输入有序数组
输入：numbers = [2,7,11,15], target = 9
输出：[1,2]
 */
public class list4 {
    public int[] twoSum(int[] numbers, int target){
        int low =0;int high = numbers.length-1;
        while(low<high){
            int sum = numbers[low]+numbers[high];
            if(sum==target){
                return new int[]{low+1,high+1};
            }else if(sum<target){
                low++;
            }else{
                high--;
            }
        }
        return new int[]{-1,-1};
    }
}
