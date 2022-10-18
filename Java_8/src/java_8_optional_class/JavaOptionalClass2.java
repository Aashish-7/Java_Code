package java_8_optional_class;

import java.util.Optional;

public class JavaOptionalClass2 {

    //If Value is Present
    public static void main(String[] args) {

        String [] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS";  // SETTING VALUE OF 5TH INDEX !!

        Optional<String> checkNull = Optional.ofNullable(str[5]);

        if(checkNull.isPresent()) {    // it check, value is present or not
            String lowerCaseString = str[5].toLowerCase();
            System.out.println(lowerCaseString);
        }
        else {
            System.out.println("String value is not present !!!!");
        }

    }
}
