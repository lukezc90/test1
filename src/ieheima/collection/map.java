package ieheima.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();

        map.put("itheima001","你最帅");
        map.put("itheima002","你最酷");
        map.put("itheima003","你最美");

//        System.out.println(map);
//        Set<String> keyset = map.keySet();
//        for(String key: keyset){
//            System.out.println(key);
//        }
//        Set<String> ks = map.keySet();
////        for(String k : ks){
////            String s = map.get(k);
////            System.out.println(k +","+ s);
////        }
        Set<Map.Entry<String,String>>entry = map.entrySet();
        for(Map.Entry<String,String> e : entry){
            String key = e.getKey();
            String value = e.getValue();
            System.out.println("k:"+key+","+"v:"+value);
        }
    }
}
