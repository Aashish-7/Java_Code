package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("Aashish");
        set.add("Kumar");
        set.add("Prajapati");
        set.add("Aashu");
        set.add("Aashish");
        set.add("aashish");

        System.out.println("With the help of iterotor !!");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("with the help of for-each loop !!");
        for (String str : set) {
            System.out.println(str);
        }
    }
}
