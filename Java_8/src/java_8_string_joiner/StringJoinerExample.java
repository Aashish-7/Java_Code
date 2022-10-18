package java_8_string_joiner;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {

        StringJoiner joinNames = new StringJoiner(",");   // passing comma(,) as delimiter

        // Adding value to string joiner
        joinNames.add("Aashish");
        joinNames.add("kumar");
        joinNames.add("Prajapati");
        joinNames.add("Aashu");

        System.out.println(joinNames);
    }
}
