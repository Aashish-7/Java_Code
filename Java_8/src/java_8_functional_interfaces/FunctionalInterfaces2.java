package java_8_functional_interfaces;

//In the following example, a functional interface is extending to a non-functional interface.

interface Double {
    default void dolt(){
        System.out.println("Do it now !!");
    }
}


interface  Sayble extends Double {
    void say(String msg);     //abstract msg
}

public class FunctionalInterfaces2 implements Sayble {

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaces2 functionalInterfaces2 = new FunctionalInterfaces2();
        functionalInterfaces2.say("Emma hi !!");
        functionalInterfaces2.dolt();
    }
}
