package java_8_method_references;

//we are using predefined functional interface Runnable to refer static method.
public class MethodReference1 {

    public static void threadStatus(){
        System.out.println("Thread is running  !!!");
    }


    public static void main(String[] args) {
        Thread t2 = new Thread(MethodReference1::threadStatus);
        t2.start();
    }
}
