package java_8_method_references;

// You can also override static methods by referring methods. In the following example, we have defined and overloaded three add methods.

import java.util.function.BiFunction;

class Arithemtics {
    public static int add(int a , int b){
        return a+b;
    }
    public static float add(int a , float b){
        return a+b;
    }
    public static float add(float a, float b){
        return a+b;
    }

}
public class MethodReference3 {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer>adder1 = Arithemtics::add;
        BiFunction<Integer, Float, Float>adder2 = Arithemtics::add;
        BiFunction<Float, Float, Float>adder3 = Arithemtics::add;

        int result1 = adder1.apply(10,20);
        float result2 = adder2.apply(20,30f);
        float result3 = adder3.apply(25f,25f);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
