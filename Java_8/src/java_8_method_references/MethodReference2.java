package java_8_method_references;

//You can also use predefined functional interface to refer methods.
//In the following example, we are using BiFunction interface and using it's apply() method.

import java.util.function.BiFunction;

class Arithimetic {
    public static int add(int a, int b) {
        return a + b;
    }
}
public class MethodReference2 {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> adder = Arithimetic::add;
        int result = adder.apply(10,20);
        System.out.println(result);
    }
}
