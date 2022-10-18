package java_8_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Producttt {     //Method Reference in stream

    int id ;
    String name;
    float price;

    public Producttt(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
public class JavaStream10 {
    public static void main(String[] args) {

        List<Producttt> productttList = new ArrayList<>();
        productttList.add(new Producttt(101, "Keyboard", 1000));
        productttList.add(new Producttt(102, "Mouse", 2000));
        productttList.add(new Producttt(103, "Laptop", 3000));
        productttList.add(new Producttt(104, "Table", 4000));

        List<Float> productPriceList = productttList.stream()
                .filter(producttt -> producttt.price>2000)   // filtering data
                .map(Producttt::getPrice)   // fetching price by referring get price method
                .collect(Collectors.toList());  // collect as list
        System.out.println(productPriceList);
    }
}
