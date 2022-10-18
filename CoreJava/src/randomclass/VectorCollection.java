package collection;


import java.util.Iterator;
import java.util.Vector;

public class VectorCollection {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.add("Aashish");
        v.add("Kumar");
        v.add("Prajapati");

        Iterator itr = v.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
