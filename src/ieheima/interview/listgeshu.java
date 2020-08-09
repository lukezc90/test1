package ieheima.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class listgeshu {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,4,6,87,4,3,8,9,3,2,46,7};
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])!=null){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        //得到map中所有的键
        Set<Integer> keyset=map.keySet();
        //创建set集合的迭代器
        Iterator<Integer> it=keyset.iterator();
        while (it.hasNext()) {
            Integer key=it.next();
            Integer value=map.get(key);
            System.out.println(key+"共有"+ value+"次 ");
        }

    }
}
