package java_8_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
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
public class LambdaExpressions9 {        //Comparator
    public static void main(String[] args) {


        List<Product> list = new ArrayList<>();

        list.add(new Product(1,"Keyborad",100));
        list.add(new Product(2, "Mouse", 101));
        list.add(new Product(3, "Laptop", 102));

        System.out.println("Sorting on the basis of name of product .>>>>");

        //implementing lambda expression !!!!
        Collections.sort(list,(p1,p2)-> {
            return p1.name.compareTo(p2.name);
                });
        for (Product p:list) {
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
    }
}
