package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Aashish");
        map.put(102, "Aashu");
        map.put(103, "Kumar");
        map.put(102, "Prajapati");

        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+ m.getValue());
        }
    }
}
//You cannot store duplicate keys in HashMap.
// However, if you try to store duplicate key with another value, it will replace the value.
