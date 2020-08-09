package ieheima.collection;

import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");

        for(String a: linkedHashSet){
            System.out.println(a);
        }
    }
}
