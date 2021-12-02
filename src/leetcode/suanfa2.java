package leetcode;
/*
https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/solution/121-mai-mai-gu-piao-de-zui-jia-shi-ji-by-leetcode-/

内层循环与外层循环作差，寻找最大值

 */

public class suanfa2 {
    public static int maxprice(int[] prices){
        int maxprice =0;
        for(int i =0;i<prices.length-1;i++){
            for(int j =i+1;j<prices.length;j++){
                int profit = prices[j] - prices[i];
                if(profit > maxprice){
                    maxprice = profit;
                }
            }
        }
        return maxprice;
    }
}
