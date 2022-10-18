package java_8_string_joiner;

import java.util.StringJoiner;

public class StringJoinerExample1 {

    public static void main(String[] args) {

        StringJoiner stringJoiner = new StringJoiner("," , "[", "]");

        stringJoiner.add("Aashish");
        stringJoiner.add("Kumar");
        stringJoiner.add("Prajapati");
        stringJoiner.add("Aashu");

        System.out.println(stringJoiner);
    }
}
