package java_8_default_methods;

interface Sayable {       // default method inside java 8 functional interface
    // Default method
    default void say () {
        System.out.println("Hello, this is default method!");
    }

    //Abstract method
    void sayMore(String msg);
}

public class DefaultMethods implements Sayable {

    @Override
    public void sayMore(String msg) {  // implementing abstract method
        System.out.println(msg);
    }
    public static void main(String[] args) {

        DefaultMethods defaultMethods = new DefaultMethods();
        defaultMethods.say();
        defaultMethods.sayMore("Hello, this is abstract method!");

    }

}
