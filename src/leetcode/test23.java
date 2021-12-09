package leetcode;
/*
最大连续数列和
[1,2,3,-6,1] 输出：6
 */
public class test23 {
    public int getMaxSum(int[] A, int n){
        int sum = A[0];
        int tem =0;
        for(int i=0;i<n;i++){
            if(tem > 0){
                tem += A[i];
            }else {
                tem = A[i];
            }
            if(sum < tem){
                sum = tem;
            }
        }
        return sum;
    }
}
