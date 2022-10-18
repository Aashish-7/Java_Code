package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection3 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Aashish"); // ignore the duplicate element by hashset !!
        set.add("Aashish");
        set.add("Aashish");
        set.add("Kumar");

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
