package ieheima.interview;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class baiduinterview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s =sc.nextInt();
        baiduinterview zc = new baiduinterview();

        zc.climbstairs(s);
    }

    public int climbstairs(int n){
        int dp[] = new int[10000];
        dp[1]=1;
        dp[2]=2;
        for( int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];

        }
        System.out.println(dp[n]);
        return dp[n];
    }

    /*
    public int climbStairs(int n) {

        int numsMax=0;
        int num1=1;
        int num2=2;

        if(n==1){
            return 1;

       }
       if(n==2){
           return 2;
       }

       for(int i=3;i<=n;i++){
         numsMax=num1+num2;
         num1=num2;
         num2=numsMax;
       }
 return numsMax;
    }
     */
}
