package ieheima.collection;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class test2 {
    public static void main(String[] args) {
        HashMap<String,Student> hashMap = new HashMap<String, Student>();

        Student s1 = new Student("zhangchi",30);
        Student s2 = new Student("wangtingting",28);
        Student s3 = new Student("children",3);

        hashMap.put("s001",s1);
        hashMap.put("s002",s2);
        hashMap.put("s003",s3);

        //键找值
//        Set<String> keyset = hashMap.keySet();
//        for(String k: keyset){
//            Student value = hashMap.get(k);
//            System.out.println(k + ","+ value.getName()+"," + value.getAge());


        //键值对对象找键和值
        Set<Map.Entry<String,Student>> entrySet = hashMap.entrySet();
        for(Map.Entry<String,Student> me : entrySet){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println("键是："+ key + ","+"值是："+ value);
            }
        }
    }

