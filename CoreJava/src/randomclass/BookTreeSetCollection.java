package collection;

import java.util.Set;
import java.util.TreeSet;

class Book6 {
    int id;
    String name, author, publisher;
    int quantity;

    public Book6(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class BookTreeSetCollection {
    public static void main(String[] args) {
        Set< Book > set = new TreeSet< Book >();
        //Creating Books
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        //Adding Books to TreeSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing TreeSet
        for (Book b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}

///Explanation: In the above program, it is required to implement a Comparable interface. It is because the TreeSet maintains the sorting order, and for doing the sorting the comparison of different objects that are being inserted in the TreeSet is must, which is accomplished by implementing the Comparable interface.
