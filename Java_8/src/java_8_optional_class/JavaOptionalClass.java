package java_8_optional_class;

//Java Program without using Optional ->
//we are not using Optional class. This program terminates abnormally and throws a nullPointerException.

public class JavaOptionalClass {
    public static void main(String[] args) {

        String [] str = new  String[5];
        String toLoweerCase = str[5].toLowerCase();
        System.out.println(toLoweerCase);
    }
}
