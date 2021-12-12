package leetcode;
/*
https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/solution/lian-xu-zi-shu-zu-de-zui-da-he-by-leetco-tiui/
最大和的子数组
因此我们只需要求出每个位置的 f(i)f(i)，然后返回 ff 数组中的最大值即可。那么我们如何求 f(i)f(i) 呢？我们可以考虑 \textit{nums}[i]nums[i] 单独成为一段还是加入 f(i-1)f(i−1) 对应的那一段，这取决于 \textit{nums}[i]nums[i] 和 f(i-1) + \textit{nums}[i]f(i−1)+nums[i] 的大小，我们希望获得一个比较大的，于是可以写出这样的动态规划转移方程：

f(i) = \max \{ f(i-1) + \textit{nums}[i], \textit{nums}[i] \}
f(i)=max{f(i−1)+nums[i],nums[i]}

不难给出一个时间复杂度 O(n)O(n)、空间复杂度 O(n)O(n) 的实现，即用一个 ff 数组来保存 f(i)f(i) 的值，用一个循环求出所有 f(i)f(i)。考虑到 f(i)f(i) 只和 f(i-1)f(i−1) 相关，于是我们可以只用一个变量 \textit{pre}pre 来维护对于当前 f(i)f(i) 的 f(i-1)f(i−1) 的值是多少

 */

public class test20 {
//    public int maxSubArray(int[] num){
//        int pre =0;
//        int maxAns =num[0];
//        for(int x : num){
//            pre = Math.max(pre+x,x);
//            maxAns = Math.max(maxAns,pre);
//        }
//        return maxAns;
//    }
    public int maxSubArray(int[] num){
        int pre =0;
        int maxAns = num[0];
        for(int x : num){
            pre = Math.max(pre+x,pre);
            maxAns = Math.max(maxAns,pre);
        }
        return maxAns;
    }
}
