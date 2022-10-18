package java_8_lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions6 {  // for each loop
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Aashish");
        list.add("Kumar");
        list.add("Prajapati");


        list.forEach(
                s -> System.out.println(s)
        );
    }

}
