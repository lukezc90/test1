package leetcode;

/*
删除元素
给定一个数组和一个值，使用就地算法将数组中所有等于这个值的元素删除，并返回新数组的长度。元素的顺序可以更改。你不用去关心大于当前数组长度的空间里面存储的值

 */
public class test25 {
    public int removeElement(int[]A,int elem ){
        int n =A.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(A[i] != elem){
                A[k++] = A[i];
            }
        }
        return k;
    }
}
