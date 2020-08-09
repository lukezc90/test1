package ieheima.encode;

import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/*
    编码：
        byte[] getBytes(): 使用平台的默认字符集将该String编码作为一系列字节，将结果存储到新的字节数组中
        byte[] getBytes(String charsetName): 使用指定的字符集将该String编码为一系列字节，将结果存储到新的字节数组中
    解码：
        String（byte[]bytes）:通过使用平台的默认字符集解码指定的字节数组来构造新的String
        String（byte[]bytes,String charsetName）:通过指定的字符集解码指定的字节数组来构造新的String
 */
public class code1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";

        byte[] bys = s.getBytes("GBK");
        System.out.println(Arrays.toString(bys));


        String ss= new String(bys,"GBK");
        System.out.println(ss);
    }
}
