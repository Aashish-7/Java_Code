package java_8_lambda;

interface Sayable {
    public String say (); // no parameter (zero or no arguments )
}
public class LambdaExpressions2 {
    public static void main(String[] args) {
        Sayable s = () -> {
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}
