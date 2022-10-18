package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollection2 {
    public static void main(String[] args) {

        TreeSet<String> al1 = new TreeSet<String>();
        al1.add("Aashish");
        al1.add("Kumar");
        al1.add("Prajapati");
        al1.add("Aashish");


        // maintain ascending order by alphabetically !!! a b c d  .........

        //Traversing elements
        Iterator<String> itr=al1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(al1);
    }
}
