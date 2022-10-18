package java_8_method_references;

// Referring to  a constructor @@@
//You can refer a constructor by using the new keyword. Here, we are referring constructor with the help of functional interface.

interface Messageable {
    Message getMessage(String msg);
}

class  Message{
    Message(String msg){
        System.out.println(msg);
    }
}

public class MethodReference7 {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello !!");
    }
}
