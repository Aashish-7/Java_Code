package java_8_optional_class;

import java.util.Optional;

//To avoid the abnormal termination, we use Optional class.
//In the following example, we are using Optional. So, our program can execute without crashing.
public class JavaOptionalClass1 {
    public static void main(String[] args) {

        //If Value is not Present

        String [] str = new String[10];
//        str[5] = "Hello , java";
        Optional<String> chechNull = Optional.ofNullable(str[5]);
        if(chechNull.isPresent()) {  // check for value is present or not
            String lowerCaseString = str[5].toLowerCase();
            System.out.println(lowerCaseString);
        }
        else {
            System.out.println("String value is not present !!");
        }
    }
}
