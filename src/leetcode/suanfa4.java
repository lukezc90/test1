package leetcode;
/*
https://leetcode-cn.com/problems/sort-colors/solution/yan-se-fen-lei-by-leetcode-solution/
颜色分类：
    给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。


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
