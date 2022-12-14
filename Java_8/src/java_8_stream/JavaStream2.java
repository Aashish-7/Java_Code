package java_8_stream;

import java.util.stream.Stream;

public class JavaStream2 {
    public static void main(String[] args) {

        Stream.iterate(1, integer -> integer + 1)
                .filter(integer -> integer%5==0)
                .limit(5)
                .forEach(System.out::println);
    }
}
