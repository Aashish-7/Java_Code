package java_8_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Books {    // convert list into map  !!!!!!!
    int id ;
    String name;
    float price;

    public Books(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStream9 {
    public static void main(String[] args) {

        List<Books> booksList  = new ArrayList<>();
        booksList.add(new Books(101, "Java", 200));
        booksList.add(new Books(102, "Python", 300));
        booksList.add(new Books(103, "Ruby", 400));
        booksList.add(new Books(104, "Snake", 500));

        // Converting books list into map

        Map<Integer, String> boookPriceMap = booksList.stream()
                .collect(Collectors.toMap(books -> books.id, books -> books.name));

        System.out.println(boookPriceMap);
    }
}
