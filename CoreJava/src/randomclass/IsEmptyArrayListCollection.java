package collection;

import java.util.ArrayList;

public class IsEmptyArrayListCollection {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        System.out.println("Is array empty :"+ al.isEmpty());

        al.add("Aashish");
        al.add("Kumar");
        al.add("Prajapati");

        System.out.println(al);
        System.out.println("After Insertion");
        System.out.println("Is array empty :"+ al.isEmpty());
    }
}
