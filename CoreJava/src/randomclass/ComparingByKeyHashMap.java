package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparingByKeyHashMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Aashish");
        map.put(102, "Kumar");
        map.put(103, "Prajapati");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
