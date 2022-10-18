package collection;

import java.util.HashMap;
import java.util.Map;


public class HashMapCollection4 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Aashish");
        map.put(2,"Kumar");
        map.put(3,"Prajapati");
        map.put(4,"Aashu");

        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("___________________");
        map.replace(4,"Aashu_Kumar");
        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("_________________--");
        map.replace(2, "Kumar", "Prajapati");
        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("__________________");
        map.replaceAll((integer, s) -> "ABC");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+ m.getValue());
        }
    }
}
