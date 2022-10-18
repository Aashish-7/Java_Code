package java_8_method_references;

//In the following example, we are referring instance (non-static) method.
//Runnable interface contains only one abstract method. So, we can use it as functional interface.
public class MethodReference5 {
    public void printMsg(){
        System.out.println("Hello, this is instance method!!");
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(new MethodReference5()::printMsg);
        t2.start();
    }
}
