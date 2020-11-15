package ieheima.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*

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
}
