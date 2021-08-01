package ieheima.file;


/*
递归
 */
public class test4 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] =1;
        arr[1] =1;

        for(int i=2;i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(arr[19]);
        System.out.println(f(20));


    }
    public static int f(int n){
        if(n==1||n==2){
            return 1;
        }else {
            return f(n-1)+f(n-2);
        }
    }
}
