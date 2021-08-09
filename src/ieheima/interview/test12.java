package ieheima.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
map遍历
 */
public class test12 {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner scanner =new Scanner(System.in);
        String str = scanner.nextLine();

        Map<String,Integer>map = new HashMap<String, Integer>();
        for(int i=0;i<str.length();i++){
            String aa = str.substring(i,i+1);
            if(map.get(aa)==null){
                map.put(aa,1);
            }else {
                Integer value = map.get(aa);
                map.put(aa,value+1);
            }
        }
        for(Map.Entry<String,Integer> a:map.entrySet()){
            String key = a.getKey();
            Integer value = a.getValue();
            System.out.println(key+":"+value+"次");
        }
    }
//    public static void main(String args[]){
//        System.out.println("请输入：");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        Map<String,Integer> map = new HashMap<String,Integer>();
//        for(int i =0;i<str.length();i++){
//            String substring = str.substring(i,i+1);
//            if(map.get(i)==null){
//                map.put(substring,1);
//            }else {
//                map.put(substring,map.get(i)+1);
//            }
//        }
//        for(Map.Entry<String,Integer> m : map.entrySet()){
//            String key = m.getKey();
//            Integer value = m.getValue();
//            System.out.println("key:"+ key + ","+"value:"+value);
//        }
//    }
}
