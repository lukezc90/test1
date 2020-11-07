package ieheima.interview;

public class maxstring {
    public static void main(String[] args) {
        maxstring max = new maxstring();
        max.findMaxCountStr("abcdefb");
    }
    public void findMaxCountStr(String str) {//abcdefb
        int max_length = 0;
        String max_str = "";
        while (str.length() > 0) {
            String first = str.substring(0, 1);//左闭右开[0,1)
            System.out.println(first);
            int length = str.length();
            str =  str.replaceAll(first, "");
            if (max_length < length - str.length()) {
                max_length = length - str.length();
                max_str = first;
            }
        }
        System.out.println(max_str + "出现次数最多,次数为" + max_length);
    }
}
