package java_8_functional_interfaces;

//A functional interface can have methods of object class. See in the following example.
interface Sayablee {
    void say(String msg); // abstract method !!

    // it has contains any no of object class method!!

    int hashCode();
    String toString();
    boolean equals(Object obj);
}

public class FunctionalInterfaces1  implements Sayablee{

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaces1 functionalInterfaces1 = new FunctionalInterfaces1();
        functionalInterfaces1.say("Try it !!");
    }
}

