package java_8_lambda;

//Without Lambda Expression
interface Drawable{
    public void draw();
}
public class LambdaExpressions {
    public static void main(String[] args) {

        int width = 10;

        //without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing "+ width);
            }
        };
        d.draw();
    }


}
