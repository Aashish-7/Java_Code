package java_8_lambda;

@FunctionalInterface // it is optional
interface Drawablee {
    public void draw();
}
public class LambdaExpressions1 {
    public static void main(String[] args) {
        int width = 100;


        // with lambda ..
        Drawable d2 = () ->
                System.out.println("Drawing "+ width);
        d2.draw();
    }
}
