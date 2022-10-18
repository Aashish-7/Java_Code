package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aashish");
        list.add("kumar");
        list.add("prajapati");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
