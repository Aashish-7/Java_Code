package collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {

        String[] array = {"Java", "Python", "C", "C++"};
        System.out.println(Arrays.toString(array));

        List<String> list = new ArrayList<>();
        for(String str : array){
            list.add(str);
        }
        System.out.println(list);
    }
}
