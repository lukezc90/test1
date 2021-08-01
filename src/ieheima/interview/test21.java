package ieheima.interview;

//0，1连续字串

public class test21 {
    public boolean check(String s){
        int m =0; //0出现次数
        int maxm = 0; //0连续出现最长长度
        int n = 0; //1出现次数
        int maxn =0; //1连续出现最长长度
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                n++;
                maxn = Math.max(n,maxn);
            }else {
                m++;
                maxm = Math.max(m,maxm);
            }
        }
        return maxm>maxn?false:true;
    }
}

