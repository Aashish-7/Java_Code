package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedListCollection {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Aashish");
        ll.add("Kumar");
        ll.add("Prajapati");

        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("_____________");

        Iterator i = ll.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
