package java_8_stream;

//We can also use collectors to compute sum of numeric values.
//In the following example, we are using Collectors class and it?s specified methods to compute sum of all the product prices.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Productt {
    int id;
    String name;
    Float price;

    public Productt(int id, String name, Float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStream6 {    // Sum by using Collectors Methods
    public static void main(String[] args) {

        List<Productt> producttList = new ArrayList<>();
        producttList.add(new Productt(11, "Java", 111.11f));
        producttList.add(new Productt(12, "Python", 122.22f));
        producttList.add(new Productt(13, "Ruby", 133.33f));
        producttList.add(new Productt(14, "Snake", 144.44f));

        // Using collector's to sum the price

        Double totalPrice = producttList.stream().mapToDouble(value -> value.price).sum();
        System.out.println(totalPrice);


    }
}
