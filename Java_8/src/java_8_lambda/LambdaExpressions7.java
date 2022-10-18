package java_8_lambda;

interface Sayableee {      // multiple statement !!
    String say(String msg);
}

public class LambdaExpressions7 {
    public static void main(String[] args) {

        //you can pass multiple statement in lambda function
        Sayableee sayableee = msg -> {
            String str1 = "I would like to say, ";
            return str1 + msg;
        };
        System.out.println(sayableee.say("time is precious!!"));
    }
}
