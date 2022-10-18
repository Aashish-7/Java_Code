package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeCollection2 {
    public static void main(String[] args) {
        //Creating Deque and adding elements

        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
