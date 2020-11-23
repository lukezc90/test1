package ieheima.interview;

/*
求200-300之间质数
 */
public class test15 {
    public static void main(String[] args) {
        for(int i=200;i<=300;i++){
            if(sushu(i)==1){
                System.out.println(i+"是素数");
            }else {
                System.out.println(i+"不是素数");
            }
        }
    }

    public static int sushu(int num){
        int res =1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                res=0;
                System.out.println(num+"%"+i+"为0");
                break;
            }
        }
        return res;
    }
}
