package leetcode;

/*
https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/solution/mai-mai-gu-piao-de-zui-jia-shi-ji-ii-by-leetcode-s/

相邻的2者作差，累加，求出最大值


 */
public class suanfa1 {
    public static int maxProfit(int[] prices){
        int maxprofit =0;
        for(int i =1;i<prices.length;i++){
            maxprofit += Math.max(0,prices[i]-prices[i-1]);
        }
        return  maxprofit;
    }
}
