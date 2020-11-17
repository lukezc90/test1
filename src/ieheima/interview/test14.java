package ieheima.interview;

import java.util.Arrays;

/*
合并2个有序数组
 */
public class test14 {
    int num1[] = {};
    int num2[] = {};
    public void merge(int num1[],int m,int num2[],int n){
        System.arraycopy(num2,0, num1,m,n);
        Arrays.sort(num1);
    }

}
