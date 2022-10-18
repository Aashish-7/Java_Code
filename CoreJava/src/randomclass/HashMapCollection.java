package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapCollection {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Aashish");
        map.put(102, "Kumar");
        map.put(103, "Prajapati");

        System.out.println(map);

        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+ m.getValue());
        }

        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        Iterator itr2 = map.keySet().iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        Iterator itr3 = map.values().iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }
    }
}
//To get the key and value elements, we should call the getKey() and getValue() methods.
// The Map.Entry interface contains the getKey() and getValue() methods.
// But, we should call the entrySet() method of Map interface to get the instance of Map.Entry.