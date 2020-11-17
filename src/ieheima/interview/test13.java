package ieheima.interview;

import java.util.Scanner;

/*
最大子数组累加和问题
 */
public class test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag = scanner.nextInt();
        int n[] = new int[flag];
        for(int i=0;i<flag;i++){
            n[i] = scanner.nextInt();
//            System.out.println(n[i]);
        }
        int a[] ={-2,1,-3,4,-1,2,1,-5,4};
        test13 test13 = new test13();
        test13.maxSubArray(a);

    }

    public int maxSubArray(int[] nums){
        int rus = nums[0];
        for(int i=1;i< nums.length;i++){
            nums[i] +=Math.max(nums[i-1],0);
            rus =Math.max(nums[i],rus);
        }
//        System.out.println(rus);
        return rus;
    }
}
