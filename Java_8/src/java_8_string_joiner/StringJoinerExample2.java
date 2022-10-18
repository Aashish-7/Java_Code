package java_8_string_joiner;

import java.util.StringJoiner;

public class StringJoinerExample2 {

    // merge two string joiner
    public static void main(String[] args) {

        StringJoiner joiner1 = new StringJoiner(",", "[", "]");
        joiner1.add("Aashish");
        joiner1.add("Kumar");

        StringJoiner joiner2 = new StringJoiner(":", "(", ")");
        joiner2.add("Aashu");
        joiner2.add("Prajapati");

        StringJoiner merge = joiner1.merge(joiner2);
        System.out.println(merge);
    }
}
