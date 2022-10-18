package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {
    public static void main(String[] args) {

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");

        //Converting ArrayList to Array
        String[] array = fruitList.toArray(new String[fruitList.size()]);
        System.out.println("Printing Array: "+ Arrays.toString(array));
        System.out.println("Printing List: "+fruitList);

        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);

        for (Integer x : arr)
            System.out.print(x + " ");
    }
}
