package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection2 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Aashish");
        map.put(102, "Kumar");
        map.put(103, "Prajapati");

        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("_________________");

        map.putIfAbsent(104,"Aashu");
        map.putIfAbsent(104,"ABC");
        map.putIfAbsent(105, "Aashu");
        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("___________");

        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Aashish");
        map1.put(110,"Xyz");

        map1.putAll(map);

        for(Map.Entry m : map1.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("___________________");
        map.putAll(map1);
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
