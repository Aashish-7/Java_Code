package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollection3 {
    public static void main(String[] args) {

        // we also use descending order z to a by alphabetically !!!!

        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ajay");

        System.out.println("Traversing element through Iterator in descending order");
        Iterator i=set.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        System.out.println(set); // ascending because descendingIterator is not use here we directly print it !
    }
}
