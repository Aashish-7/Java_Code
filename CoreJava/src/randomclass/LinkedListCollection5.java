package collection;

import java.util.LinkedList;
import java.util.List;

class Book1 {
    int id;
    String name, author, publisher;
    int quantity;

    public Book1(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public Book1() {

    }
}
public class LinkedListCollection5 {
    public static void main(String[] args) {

        LinkedList<Book1> list = new LinkedList<>();

        Book1 book1 = new Book1(101, "java", "oracle", "KNM", 5);
        Book1 book2 = new Book1(102, "java2", "oracle2", "KNM2", 6);
        Book1 book3 = new Book1(103, "java3", "oracle3", "KNM3", 7);

        list.add(book1);

        list.add(book3);
        list.add(book1);
        list.add(book2);

        System.out.println(book1.id);

        for (Book1 b : list) {
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        Book1 book11 = new Book1();
        for(int i = 0 ; i< list.size(); i++) {
            for(int j = 0; j<i; j++){
                System.out.println(book11.id+" "+ book11.name+" "+ book11.author+" "+ book11.publisher+" "+book11.quantity);
            }
        }
    }
}
