package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortArrayListCollection {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Aashish");
        list.add("Kumar");
        list.add("Prajapati");
        list.add("Aashu");

        Collections.sort(list);
        for(String str : list) {
            System.out.println(str);
        }

        System.out.println("______________");

        List<Integer> list1  = new ArrayList<>();
        list1.add(11);
        list1.add(222);
        list1.add(1);
        list1.add(10);

        Collections.sort(list1);

        for (Integer str :
                list1) {
            System.out.println(str);
        }
    }



}
