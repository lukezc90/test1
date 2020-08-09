package ieheima.file;

import java.io.File;

public class test6 {
    public static void main(String[] args) {
        //根据给定路径创建一个对象
        File srcfile = new File("D:\\idea-test");
        //
        getallpath(srcfile);
    }
    //定义一个方法，用于获取给定目录下的所有内容，参数为第1步创建的File对象
    public static void getallpath(File srcfile){
        // 获取给定的File目录下所有的文件或者目录的File数组
        File[] filearray = srcfile.listFiles();
        //遍历该File数组，得到每一个File对象
        if(filearray !=null){
            for(File file:filearray){
                //判断该File对象是否是目录
                if(file.isDirectory()){
                    getallpath(file);
                }else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
