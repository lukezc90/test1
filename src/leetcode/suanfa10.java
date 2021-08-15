package leetcode;

/*
https://leetcode-cn.com/problems/unique-paths/solution/bu-tong-lu-jing-by-leetcode-solution-hzjf/
动态规划-不同矩阵
 */
public class suanfa10 {
    public int uniquePaths(int m,int n){
        int f[][] = new int[m][n];
        for(int i =0;i<m;i++){
            f[i][0] = 1;
        }
        for(int j =0;j<n;j++){
            f[0][j] = 1;
        }

        for(int i =1;i<m;++i){
            for(int j =1;j<n;++j){
                f[i][j] = f[i-1][j]+f[i][j-1];
            }
        }
        return f[m-1][n-1];
    }
}
