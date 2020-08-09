package ieheima.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class hashmaparraylist {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("武松");
        arr1.add("鲁智深");
        hm.put("水浒传",arr1);

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("孙悟空");
        arr2.add("唐僧");
        hm.put("西游记",arr2);

        ArrayList<String> arr3 = new ArrayList<String>();
        arr3.add("张驰");
        arr3.add("liuyuqiong");
        hm.put("红楼梦",arr3);

//        System.out.println(hm);


        Set<String> key = hm.keySet();
        for(String k: key){
            System.out.println(k);
            ArrayList<String> arrayList = hm.get(k);
            for(String s:arrayList){
                System.out.println("\t"+ s);
            }
        }
    }
}
