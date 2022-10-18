package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterfaceCollection {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Aashish");
        map.put(102, "Kumar");
        map.put(103, "Prajapati");

        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+ m.getValue());
        }

        System.out.println(map);

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator iterator1 = map.values().iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        Iterator iterator2 = map.keySet().iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
