package leetcode;
/*
https://leetcode-cn.com/problems/sort-colors/solution/yan-se-fen-lei-by-leetcode-solution/

 形象的理解可以是i++先做别的事，再自己加1，++i先自己加1，再做别的事情
 */
public class suanfa4 {
    public static void sourcolors(int[] nums){
        int ptr = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0){
                int tmp=nums[i];
                nums[i]=nums[ptr];
                nums[ptr]=tmp;
                ++ptr;
            }
        }
        for(int j=ptr;j<nums.length;j++){
            if(nums[j]==1){
                int tmp = nums[j];
                nums[j]=nums[ptr];
                nums[ptr] = tmp;
                ++ptr;
            }
        }
    }
}
