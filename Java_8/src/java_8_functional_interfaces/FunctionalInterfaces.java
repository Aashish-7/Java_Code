package java_8_functional_interfaces;

interface Sayable {
    void say(String msg);
}

public class FunctionalInterfaces implements Sayable {

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaces functionalInterface = new FunctionalInterfaces();
        functionalInterface.say("Hello, Java!!");
    }
}
