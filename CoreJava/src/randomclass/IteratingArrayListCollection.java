package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingArrayListCollection {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Aashish");
        al.add("Kumar");
        al.add("Prajapati");
        al.add("Aashu");
        al.add("Aashu");

        System.out.println("traversing the list through the list-iterator !!");
        ListIterator ltr = al.listIterator(al.size());
        while (ltr.hasPrevious()) {
            System.out.println(ltr.previous());
        }

        System.out.println("traversing list through for loop !!");
        for(int i = 0; i<al.size(); i ++) {
            System.out.println(al.get(i));
        }

        System.out.println("traversing list through forEach() method");
        al.forEach(s -> {
            System.out.println(s);
        });

        System.out.println("traversing list through forEachRemaining() method !!");
        Iterator itr = al.iterator();
        itr.forEachRemaining(o -> {
            System.out.println(o);
        });
    }
}
