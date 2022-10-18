package java_8_method_references;

//we have defined a functional interface and referring a static method to it's functional method say().
interface Sayable {
    void say();
}

public class MethodReference {       //Reference to a Static Method
   public static void saySomething(){
       System.out.println("Hello, this is static method !!");
   }

    public static void main(String[] args) {
        //referring static method
        Sayable sayable = MethodReference::saySomething;
        //Calling interface method
        sayable.say();
    }
}
