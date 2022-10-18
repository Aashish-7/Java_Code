package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetFromAnotherCollection {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        System.out.println("print list "+ list);

        HashSet<String> set = new HashSet<>(list);
        set.add("Six");
        set.add("seven");

        System.out.println("print set " +set);

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
