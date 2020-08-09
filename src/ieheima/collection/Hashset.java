package ieheima.collection;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> ha = new HashSet<String>();

        ha.add("hello");
        ha.add("world");
        ha.add("java");

        ha.add("world");

        for(String s:ha){
            System.out.println(s);
        }

    }
}
