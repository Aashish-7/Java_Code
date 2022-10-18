package collection;

import java.util.HashSet;
import java.util.function.Predicate;

public class HashSetCollection4 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        System.out.println("print hash set .." +set);

        set.remove("one");
        System.out.println("after removed one .." +set);

        HashSet<String> set1 = new HashSet<>();
        set1.add("six");
        set1.add("seven");
        System.out.println("print hash set1 .." +set1);

        set.addAll(set1);
        System.out.println("after add set1 in set .." +set);

        set.removeAll(set1);
        System.out.println("after removed set1 in set .." +set);

        set.removeIf(Predicate.isEqual("two"));
        System.out.println("after remove if two .." + set);

        set.removeIf(str -> str.contains("three"));
        System.out.println("after remove if three .." + set);

        set.clear();
        System.out.println("after clear entire set with clear method .." +set);

    }
}
