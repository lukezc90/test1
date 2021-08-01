package ieheima.interview;

public class test20 {
    public static void main(String[] args) {
        int index = f(4);
        System.out.println(index);
    }

    public static int f(int dex){
        int[] arr ={1,4,8,12,20,24};
        int left = 0;
        int end = arr.length-1;

        while (left<=end){
            int m = (left+end)/2;
            if(dex == arr[m] ){
                return m;
            }else if(arr[m]<dex){
                left = m +1;
            }else {
                end = m-1;
            }
        }

        return -1;
    }
}
