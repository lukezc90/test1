package ieheima.interview;

/*
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 */
public class test7 {
    public int maxprice(int price[]){
        int len = price.length;
        if (len<2){
            return 0;
        }
        int res =0;
        for(int i=1;i<len;i++){
            int dif = price[i]-price[i-1];
            if(dif>0){
                res = res+dif;
            }
        }
        System.out.println(res);
        return res;

    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        test7 test =new test7();
        test.maxprice(a);

    }
}
