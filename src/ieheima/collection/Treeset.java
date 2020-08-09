package ieheima.collection;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        treeSet.add(40);
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(30);

        for(Integer a: treeSet){
            System.out.println(a);
        }
    }
}
