package java_8_stream;


//Filtering Collection by using Stream

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Products {
    int id ;
    String name;
    float price;

    public Products(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class JavaStream1 {
    public static void main(String[] args) {

        List<Products> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Products(1,"HP Laptop",25000f));
        productsList.add(new Products(2,"Dell Laptop",30000f));
        productsList.add(new Products(3,"Lenevo Laptop",28000f));
        productsList.add(new Products(4,"Sony Laptop",28000f));
        productsList.add(new Products(5,"Apple Laptop",90000f));

        List<Float> productPriceList = productsList.stream()
                .filter(p -> p.price > 30000) // filtering data
                .map(p-> p.price)  // fetching price
                .collect(Collectors.toList()); // collect as list

        System.out.println(productPriceList);
    }
}
