package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection2 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Aashish");
        ll.add("Kumar");
        ll.add("Prajapati");

        Iterator itr = ll.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
