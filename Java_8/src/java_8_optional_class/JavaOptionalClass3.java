package java_8_optional_class;

import java.util.Optional;

public class JavaOptionalClass3 {
    public static void main(String[] args) {

        // Another java oprional class

        String [] str = new String[10];

        // setting value for 5th index
        str [5] = "HELLO, OPTIONAL CLASS!!";

        Optional<String> checkNull = Optional.ofNullable(str[5]);

        checkNull.ifPresent(System.out::println);  // printing value using method reference
        System.out.println(checkNull.get());
        System.out.println(str[5].toLowerCase());
    }
}
