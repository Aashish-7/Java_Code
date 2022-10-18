package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCollection3 {
    public static void main(String[] args) {
        // ignoring duplicate elements !!!


        LinkedHashSet<String> al = new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //maintain insertion order !! properly  !!

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(al);
    }
}
