package ieheima.interview;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class find {
    public static void main(String[] args) throws IOException {
//        BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("D:\\learn\\2.txt"));
//        BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream("D:\\learn\\2.txt"));
        BufferedReader bis = new BufferedReader(new FileReader("D:\\learn\\2.txt"));
        ArrayList<Object> list = new ArrayList<Object>();
        String ls;
        while((ls = bis.readLine())!=null){
//            String[] ls2=ls.split("");
            list.add(ls);
//            System.out.print(list);
        }
        bis.close();
        System.out.print(list);
        String s ="张驰";
        int num =0;
        for(Object a:list){
            if(a.equals(s)){
                num++;
            }
        }
        System.out.println(num);
//        HashMap<Integer,Object> hashMap = new HashMap<Integer, Object>();

    }
}
