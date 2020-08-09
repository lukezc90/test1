package ieheima.file;

public class test5 {
    public static void main(String[] args) {
        //调用方法
        int result = jc(5);
        System.out.println(result);
    }
    //定义一个方法，用于递归求阶乘
    public static int jc(int n){
        //方法内部判断是否是1
        if(n==1){
            return 1;
        }else {
            //不是，返回n*(n-1)!
            return n*jc(n-1);
        }
    }
}
