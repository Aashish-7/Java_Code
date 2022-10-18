package java_8_collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product {
    int id ;
    String name ;
    float price ;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class JavaCollectors {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(101, "Laptop", 101.101f));
        productList.add(new Product(102, "Dell", 102.102f));
        productList.add(new Product(103, "Asur", 103.103f));
        productList.add(new Product(104, "Lenova", 104.104f));

        //Fetching data as a List
        List<Float> productPriceList = productList.stream()
                .map(product -> product.price)    // fetching price
                .collect(Collectors.toList());    // collect as a list
        System.out.println("data as a list :" +productPriceList);

        System.out.println("_________________________________________");

        //Converting Data as a Set
        Set<Float> setPrice = productList.stream()
                .map(product -> product.price)   // fetching data
                .collect(Collectors.toSet());    // collect as a set
        System.out.println("fetching data as a set :" +setPrice);

        System.out.println("___________________________________________");

        //Using sum method

        // sum of prices
        Double sumPrice = productList.stream()
                .collect(Collectors.summingDouble(value -> value.price));
        System.out.println("Sum of product price :" + sumPrice);

        // try for float but casting is required !!!
        // sum of prices
        Long sum = productList.stream().collect(Collectors.summingLong(value -> (long) value.price));
        System.out.println("Sum of product price :"+sum);

        // sum of id's
        Integer sumId = productList.stream()
                .collect(Collectors.summingInt(value -> value.id));
        System.out.println("Sum od id's :" +sumId);

        // sum of is but use long data type  !  ! ! ! ! !
        Long londCount = productList.stream()
                .collect(Collectors.summingLong(value -> value.id));
        System.out.println("Sum od id's :" +londCount);

        System.out.println("____________________________");

        //Getting Product Average Price
        Double average = productList.stream()
                .collect(Collectors.averagingDouble(value -> value.price));
        System.out.println("Average price of all product :" +average);

        System.out.println("________________________-------------");

        //Counting Elements

        Long noOfElements = productList.stream()
                .collect(Collectors.counting());
        System.out.println("Total elements :" + noOfElements);
    }
}
