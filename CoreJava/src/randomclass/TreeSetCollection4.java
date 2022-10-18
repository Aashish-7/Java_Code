package collection;

import java.util.TreeSet;

public class TreeSetCollection4 {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(11);
        treeSet.add(12);
        treeSet.add(13);
        treeSet.add(14);

        System.out.println(treeSet);

        System.out.println("lowest value " + treeSet.pollFirst());
        System.out.println("highest value " + treeSet.pollLast());
    }
}
