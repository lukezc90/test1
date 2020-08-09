package ieheima.file;

import java.io.File;

public class test3 {
    public static void main(String[] args) {
        File f1 = new File("idea activity\\黑马.txt");
//        System.out.println(f1.isDirectory());//文件夹
//        System.out.println(f1.isFile());//文件
//        System.out.println(f1.exists());//存在

//        System.out.println(f1.getAbsolutePath());
//        System.out.println(f1.getPath());
//        System.out.println(f1.getName());

        File f2 = new File("D:\\idea activity");
//        String[] strarr = f2.list();
//        for(String arr:strarr){
//            System.out.println(arr);
//        }

        File[] farr = f2.listFiles();
        for(File f:farr){
            if(f.isFile()){
                System.out.println(f.getName());
            }
//            System.out.println(f);
        }


    }
}
