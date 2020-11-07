package ieheima.interview;
/*
一串字符串，输出error中e的下标
 */

public class test2 {
    public static void main(String[] args) {
        String str = "abcderrorfghijklmnabc";
        System.out.println(str.indexOf("error"));  //结果为2，为字符"c"第一次出现的位置
        //System.out.println(str.indexOf("x"));  //结果为-1，没有找到字符"x"
    }
}
