package java_8_string_joiner;

import java.util.StringJoiner;

public class StringJoinerExample3 {

    //StringJoiner Methods
    public static void main(String[] args) {

        StringJoiner joinNames = new StringJoiner(",");

        // print nothing because it is empty !!
        System.out.println(joinNames);

        // we can set default empty value !!
        joinNames.setEmptyValue("it is empty");
        System.out.println(joinNames);

        // adding value to string joiner
        joinNames.add("Aashish");
        joinNames.add("Prajapati");
        joinNames.add("11");
        System.out.println(joinNames);

        // return length of string joiner
        int length = joinNames.length();
        System.out.println("leength of string joiner : "+ length);

        // return joiner as string type
        String str = joinNames.toString();
        System.out.println(str);

        // now we can apply string method on it !!
        char ch = str.charAt(3);
        System.out.println(ch);

        // add new string
        joinNames.add("Kumar");
        System.out.println(joinNames);

        // return new length
        int lengths = joinNames.length();
        System.out.println(lengths);

        joinNames.setEmptyValue("Empty");
        System.out.println(joinNames);


    }
}
