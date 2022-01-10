package leetcode;
/*
回文数字
 */
public class test34 {
    public boolean isPalindrome (int x) {
        // write code here
        String s = String.valueOf(x);
        //声明双指针
        int left = 0;
        //注意right指针的初始值
        int right = s.length()-1;
        //注意循的终止条件
        while(left<=right){
            //判断两个指针指向的数字是否一样
            if(s.charAt(left)==s.charAt(right)){
                //判断结束移动指针
                left++;
                right--;
            }else{
                return  false;
            }
        }
        return true;
    }
}
