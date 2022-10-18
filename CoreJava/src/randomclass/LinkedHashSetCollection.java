package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCollection {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Aashish");
        set.add("Kumar");
        set.add("Aashish");
        set.add("Prajapati");

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("with the help of for-each loop !!");
        for (String str : set) {
            System.out.println(str);
        }
    }
}
