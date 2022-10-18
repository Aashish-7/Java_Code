package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeCollection {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.add("aashsih");
        deque.add("kumar");
        deque.add("prajapati");

        for (String str :
                deque) {
            System.out.println(str);
        }
    }
}
