package ieheima.interview;

/*
字符数组反转
 */
public class test10 {
    public void reverseString(char s[]){
        if(s==null || s.length<=0){
            return;
        }
        char tmp =s[0];
        int length = s.length;
        for(int i=0;i<length/2;i++){
            tmp = s[i];
            s[i] = s[length-1-i];
            s[length-1-i] = tmp;
        }
    }
}
