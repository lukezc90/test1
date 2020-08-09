package ieheima.interview;

public class countstr {
    public static void main(String[] args) {
        String str ="ABC123ABC";
        String b ="B";
        int count;

        int strlength = str.length();
        str = str.replace(b,"");
        System.out.println(str);
        int n = str.length();

        count = strlength - n;
        System.out.println("字符"+ b + "出现的次数为:" + count);
    }
}
