package java_8_default_methods;

interface Sayablee {                // static method inside  java 8 functional  interface

    // Default method
    default void say() {
        System.out.println("Hello, this is default method!");
    }

    // Abstract method
    void sayMore(String msg) ;

    // Static method
    static void sayLouder (String msg) {
        System.out.println(msg);
    }
}

public class DefaultMethods1 implements Sayablee {
    @Override
    public void sayMore(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {

        DefaultMethods1 defaultMethods1 = new DefaultMethods1();
        defaultMethods1.say();
        defaultMethods1.sayMore("Hello, this is abstract method!");
        Sayablee.sayLouder("Hello, this is static method!");
    }
}
