package java_8_stream;

import java.util.ArrayList;
import java.util.List;

class Book {
    int id;
    String name;
    float price;

    public Book(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStream3 {    // Filtering and Iterating Collection
    //we are using filter() method. Here, you can see code is optimized and very concise.
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(101, "Java", 1.0f));
        bookList.add(new Book(102, "Python", 2.0f));
        bookList.add(new Book(103, "Ruby", 3.0f));

        //this is more compact approach for filtering data

        bookList.stream()
                .filter(book -> book.price==3)
                .forEach(book -> System.out.println(book.name));

    }
}
