package java_8_stream;

import java.util.ArrayList;
import java.util.List;

class Product {     //Filtering Collection without using Stream
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStream {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> productPriceList = new ArrayList<>();

        for(Product product : productsList) {

            //filtering the data
            if (product.price<30000){
                productPriceList.add(product.price);
            }
        }
        System.out.println(productPriceList);

    }
}
