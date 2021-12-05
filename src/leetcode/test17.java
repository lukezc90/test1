package leetcode;

import java.util.Arrays;

/*
https://leetcode-cn.com/problems/merge-sorted-array/solution/he-bing-liang-ge-you-xu-shu-zu-by-leetco-rrb0/
 */
public class test17 {
    public static void merge(int[] nums1,int m,int[] nums2,int n){
        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
