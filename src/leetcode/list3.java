package leetcode;
/*
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
 */
public class list3 {
    public void moveZeroes(int[] nums){
        if(nums == null){
            return;
        }
        //第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
        int j =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++] = nums[i];
            }

        }
        //非0元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
