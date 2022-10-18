package collection;

import java.util.HashMap;

public class HashMapCollection3 {
    public static void main(String[] args) {

        HashMap<Integer, String> map  = new HashMap<>();
        map.put(1,"Aashish");
        map.put(2,"Aashu");
        map.put(3,"Kumar");
        map.put(4,"Prajapati");

        System.out.println(map);

        map.remove(1);
        map.remove(2,"Aashu");

        System.out.println(map);
    }
}
