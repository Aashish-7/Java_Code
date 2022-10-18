package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueCollection {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.add("Aashish");
        queue.add("Kumar");
        queue.add("Prajapati");
        queue.add("Aashish");

        System.out.println("head: "+ queue.element() );
        System.out.println("head: "+queue.peek());
        System.out.println("Iterating the queue element !!");

        Iterator itr = queue.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll();

        System.out.println("After removing !!");
        Iterator itr2 = queue.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
