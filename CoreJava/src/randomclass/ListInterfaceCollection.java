package collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceCollection {
    public static void main(String[] args) {

        List<String> ll = new ArrayList<>();
        ll.add("Aashish");
        ll.add("Kumar");
        ll.add("Prajapati");

        for(String str: ll){
            System.out.println(str);
        }
    }
}
