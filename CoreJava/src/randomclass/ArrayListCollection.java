package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {
    public static void main(String[] args) {

        ArrayList<String> list=  new ArrayList<>();
        list.add("Aashish");
        list.add("kumar");
        list.add("prajapati");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("________________________");

        System.out.println(list);

        System.out.println("_________________________");

        System.out.println("With the help of for-each loop !!");
        for(String str : list) {
            System.out.println(str);
        }
        System.out.println("________________________");

        System.out.println("Returing element :" + list.get(1));

        System.out.println("____________________________");

        list.set(1,"kmr");
        for(String str : list) {
            System.out.println(str);
        }

    }
}
