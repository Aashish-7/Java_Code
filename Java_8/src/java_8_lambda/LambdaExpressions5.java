package java_8_lambda;

interface Addable {
    int add (int a, int b);
}
public class LambdaExpressions5 {
    public static void main(String[] args) {      // with or without return keyword ..

        //Lambda expression without return keyword.
        Addable ad1 = (a, b) -> (a + b); {
            System.out.println(ad1.add(10,20));

            //Lambda expression with return keyword.
            Addable ad2 = (int a , int b) -> {
                return (a + b);
            };
            System.out.println(ad2.add(100,200));
        }
    }
}
