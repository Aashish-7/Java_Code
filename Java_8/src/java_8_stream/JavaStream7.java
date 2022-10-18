package java_8_stream;

import java.util.ArrayList;
import java.util.List;

class Laptop{
    int id;
    String name;
    float price;

    public Laptop(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStream7 {     // count() method in collection
    public static void main(String[] args) {

        List<Laptop>  laptopList = new ArrayList<>();
        laptopList.add(new Laptop(1, "Dell", 200));
        laptopList.add(new Laptop(2, "HP", 300));
        laptopList.add(new Laptop(3, "Asus" ,400));
        laptopList.add(new Laptop(4, "Realme", 500));
        laptopList.add(new Laptop(5, "Honor", 600));

        //Count no of product based on the filter

        long count = laptopList.stream()
                .filter(laptop -> laptop.price>300)
                .count();
        System.out.println(count);
    }
}
