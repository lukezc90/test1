package ieheima.interview;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class baiduinterview {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int s =sc.nextInt();
//        baiduinterview zc = new baiduinterview();
//
//        zc.climbstairs(s);
//    }
//
//    public int climbstairs(int n){
//        int dp[] = new int[10000];
//        dp[1]=1;
//        dp[2]=2;
//        for( int i=3;i<=n;i++){
//            dp[i] = dp[i-1]+dp[i-2];
//
//        }
//        System.out.println(dp[n]);
//        return dp[n];
//    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        baiduinterview bs = new baiduinterview();
        bs.climb(i);
    }

    public int climb(int n){
        int[] dp = new int[10000];
        dp[1] =1;
        dp[2] =2;

        for(int i=3;i<=n;i++){
            dp[n] = dp[n-1]+dp[n-2];
        }
        return dp[n];
    }

}
