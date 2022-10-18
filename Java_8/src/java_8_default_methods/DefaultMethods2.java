package java_8_default_methods;
// Abstract class
// After having default and static methods inside the interface, we think about the need of abstract class in Java.
// An interface and an abstract class is almost similar except that you can create constructor in the abstract class
// whereas you can't do this in interface.

abstract  class AbstractClass {


    // Constructor
    public AbstractClass() {
        System.out.println("You can create constructor in abstract class !!");
    }

    // Abstract method
    abstract int add (int a , int b);

    // Non-abstract method
    int sub(int a, int b) {
        return a-b;
    }

    // Static method
    static int multiply(int a , int b) {
        return  a*b;
    }
}

public class DefaultMethods2 extends AbstractClass{

    @Override
    int add(int a, int b) {  // Implementing abstract method
        return a+b;
    }

    public static void main(String[] args) {

        DefaultMethods2 defaultMethods2 = new DefaultMethods2();
        int resul1 = defaultMethods2.add(10, 20);
        int result2 = defaultMethods2.sub(20, 10);
        int result3 = AbstractClass.multiply(10, 20);


        System.out.println(resul1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println(defaultMethods2.add(10, 10));
    }
}
