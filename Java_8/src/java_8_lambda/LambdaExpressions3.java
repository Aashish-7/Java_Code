package java_8_lambda;

interface Sayablee {
    public String say(String name);  // single parameter ..
}
public class LambdaExpressions3 {
    public static void main(String[] args) {

        Sayablee s = name -> {
            return "Hello," + name;
        };
        System.out.println(s.say("Aashish"));

        Sayablee s2 = name -> {
            return "Hello, " + name;
        };
        System.out.println(s2.say("Prajapati"));
    }
}
