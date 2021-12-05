package leetcode;

import java.util.Arrays;

/*
https://leetcode-cn.com/problems/merge-sorted-array/solution/he-bing-liang-ge-you-xu-shu-zu-by-leetco-rrb0/


合并2个有序数组同test17

 */
public class suanfa3 {
    public void merge(int[] num1,int m,int[] num2,int n){
        System.arraycopy( num2,0, num1,m,n);
        Arrays.sort(num1);
    /*src表示源数组

        srcPos表示源数组中拷贝元素的起始位置。

        dest表示目标数组

                destPos表示拷贝到目标数组的起始位置

        length表示拷贝元素的个数
        */
    }
}
