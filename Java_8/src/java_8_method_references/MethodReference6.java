package java_8_method_references;

import java.util.function.BiFunction;

// In the following example, we are using BiFunction interface.
// It is a predefined interface and contains a functional method apply(). Here, we are referring add method to apply method.
class Math {
    public int add(int a,int b){
        return a+b;
    }
}

public class MethodReference6 {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> adder = new Math()::add;
        int result = adder.apply(13,27);
        System.out.println(result);
    }
}
