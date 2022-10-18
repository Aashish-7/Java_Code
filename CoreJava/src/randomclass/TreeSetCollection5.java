package collection;

import java.util.TreeSet;

public class TreeSetCollection5 {
    public static void main(String[] args) {

        TreeSet<String> set=new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("Initial Set: "+set);

        System.out.println("Reverse Set: "+set.descendingSet());

        System.out.println("Head Set: "+set.headSet("C", false));
        // less than from both of then true and false !!!
        System.out.println("Head Set: "+set.headSet("C", true));

        System.out.println("SubSet: "+set.subSet("A", false, "E", true));
        System.out.println("SubSet: "+set.subSet("A", false, "E", false));

        System.out.println("TailSet: "+set.tailSet("C", false));
        // greater than from both side true and false !!
        System.out.println("TailSet: "+set.tailSet("C", true));

    }
}
