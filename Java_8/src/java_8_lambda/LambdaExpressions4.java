package java_8_lambda;

interface Adable {
    int add(int a , int b);  //multiple parameter
}
public class LambdaExpressions4 {
    public static void main(String[] args) {

        //multiple parameter in lambda expression
        Adable ad1 = (a, b) -> (a + b); {
            System.out.println(ad1.add(10,20));

            //multiple parameter with data type in lambda expression
            Adable ad2 = (int a , int b ) -> (a + b); {
                System.out.println(ad2.add(100,200));
            }
        }
    }
}
