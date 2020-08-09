package ieheima.colandfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader bi = new BufferedReader(new FileReader("D:\\learn\\1.txt"));
        //创建Arraylist集合对象
        ArrayList<String> array = new ArrayList<String>();
        //调用字符缓冲输入流对象的方法读数据
        String line;
        while ((line = bi.readLine())!=null){
            //把读取到的字符串数据存储到集合中
            array.add(line);
        }

        //释放资源
        bi.close();
        //遍历集合
        for(String ar : array){
            System.out.println(ar);
        }
    }
}
