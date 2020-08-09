package ieheima.interview;

//import com.sun.org.apache.xpath.internal.operations.String;

public class test1 {
    public static void main(String[] args) {
            String str = "anAdEfg";
            //获取指定位置的字符
            char c1 = str.charAt(0);
//            System.out.println(c1);
            int c2 = str.indexOf("n");
//            System.out.println(c2);
            int c3 = str.indexOf("fg",1);
//            System.out.println(c3);
            //从指定位置截取字符串，默认到末尾
            String c4 = str.substring(2);
//            System.out.println(c4);
            //从指定位置开始,到指定位置结束
            String c5 = str.substring(2,4);
//            System.out.println(c5);
            //字符串转换为字符数组
            char[] chars = str.toCharArray();
//            for(int i=0;i<chars.length;i++){
//                System.out.println(chars[i]);
//            }
            //把字符数组转换为字符串
            String s2 = new String(chars);
//            System.out.println(s2);
            int a =12345;
            String s3 = Integer.toString(a);
//            System.out.println(s3.getClass().getName());
            String s4 ="zhangchi";
            String s5 = str.concat(s4);
//            System.out.println(s5);
            //int->String
            int i = 1234567;
            String s7 ="3";
            String s8 =String.valueOf(i);//使用string静态对象，只生成一个对象;
//            System.out.println(s8.getClass().getName());
//            String s9 =Integer.toString(i);
            //String->int
            int i2 = Integer.valueOf(s7).intValue();
//            System.out.println(i2);

            String sa = new String("hello");
            String sb = new String("hello");
            System.out.println(sa.equals(sb));//判断字符串内容
            System.out.println(sa == sb);//判断字符串引用

    }
}
