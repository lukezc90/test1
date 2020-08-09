package ieheima.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class test1 {
    public static void main(String[] args){
        ArrayList<String> array = new ArrayList<String>();

//        Student s1= new Student("林青霞",30);
        String s2 ="hello world";
        array.add(s2);

        Iterator<String> it =array.iterator();
        while (it.hasNext()){
            String s= it.next();
            System.out.println(s);
        }
    }
}
