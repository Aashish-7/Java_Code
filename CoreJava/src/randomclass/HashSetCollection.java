
package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("aashish");
        set.add("aashish");
        set.add("kumar");
        set.add("prajapati");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("With the help of for-each loop");
        for(String str : set ) {
            System.out.println(str);
        }
    }
}
