package ieheima.interview;

public class test19 {
    public static void main(String[] args) {
        String str = "abcba";
        StringBuffer bs= new StringBuffer("");
//        char ca = str.charAt(0);
        //char[] chars = str.toCharArray();//字符串转字符数组
//        str.indexOf("a"); //a出现的第一个位置
//
//        str.trim();//去掉字符串两边的空格
//        str.substring(0,1);//截取第一个字符为新的字符串
//
//        str.split("b");
//        System.out.println(str.split("b"));

        //Integer.valueOf(str) 字符串转int
        //String.valueOf(int) int转字符串
        //String.valueOf(char) 字符串转char
        int result =1;
        for(int i=str.length()-1;i>=0;i--){
            bs.append(str.charAt(i));


        }
        String a1 = new String(bs);
        if(a1.equals(str)){
            System.out.println("是回文");

        }else {
            System.out.println("不是回文");
        }


    }
}
