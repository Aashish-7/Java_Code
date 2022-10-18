package java_8_optional_class;

import java.util.Optional;

public class JavaOptionalClass4 {

    //Java Optional Methods Example
    public static void main(String[] args) {

        String [] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE"; // setting value of 5th index

        // it returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        // it returns a non empty optional
        Optional<String> value = Optional.of(str[5]);

        // if value is present , it return an Optional otherwise return an empty optional
        System.out.println("Filtered value :" + value.filter(s -> s.equals("ABC")));
        System.out.println("Filtered value :" + value.filter(s -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));

        // It returns value an optional. if value is not present, it throw an non such element exception !!
        System.out.println("Getting value :" + value.get());

        // it returns  hash code of the value
        System.out.println("Getting hashcode :" + value.hashCode());

        // it returns true if value is present otherwise false
        System.out.println("Is value present :" + value.isPresent());

        // It returns non-empty Optional if value is present, otherwise returns an empty Optional
        System.out.println("Nullable optional : " + Optional.ofNullable(str[5]));

        // It returns value if available, otherwise returns specified value,
        System.out.println("OrElse: " + value.orElse("Value is not present"));
        System.out.println("OrElse: " + empty.orElse("value is not present"));

        value.ifPresent(System.out::println);   // printing value by using method reference !!

    }
}
