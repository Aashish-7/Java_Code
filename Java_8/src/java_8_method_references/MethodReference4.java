package java_8_method_references;

//Reference to an Instance Method

interface Sayble {
    void say();
}
public class MethodReference4 { //we are referring non-static methods. You can refer methods by class object and anonymous object.
    public void saySomething(){
        System.out.println("Hello, this is non-static method!!");
    }

    public static void main(String[] args) {

        MethodReference4 methodReference4 = new MethodReference4();
        //referring non-static method using references !!

        Sayble sayble = methodReference4::saySomething;
        sayble.say();

        //referring non-static method using anonymous object!!
        Sayble sayble1 = new MethodReference4()::saySomething;
        sayble1.say();
    }
}
