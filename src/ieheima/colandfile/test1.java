package ieheima.colandfile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) throws IOException {
        //创建ArrayList集合
        ArrayList<String> array = new ArrayList<String>();

        //往集合中存储字符串元素
        array.add("hello");
        array.add("world");
        // 创建自符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\learn\\3.txt"));
        //遍历集合，得到每一个字符串数据
        for(String ar:array){
            //调用字符缓冲输出流对象的方法写数据
            bw.write(ar);
            bw.newLine();
            bw.flush();
        }


        //释放资源
        bw.close();
    }
}
