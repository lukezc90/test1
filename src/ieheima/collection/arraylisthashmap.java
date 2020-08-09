package ieheima.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class arraylisthashmap {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> array = new ArrayList<HashMap<String,String>>();

        HashMap<String,String> hm1 = new HashMap<String,String>();
        hm1.put("zhangchi1","wangtingting1");

        HashMap<String,String> hm2 = new HashMap<String,String>();
        hm2.put("zhangchi2","wangtingting2");

        HashMap<String,String> hm3 = new HashMap<String,String>();
        hm3.put("zhangchi3","wangtingting3");

        array.add(hm1);
        array.add(hm2);
        array.add(hm3);

        System.out.println(array);

        for(HashMap<String,String> ar: array){
            Set<String> key = ar.keySet();
            for(String k:key){
                String v = ar.get(k);
                System.out.println("k:"+k+","+"v:"+v);
            }
        }
    }
}
