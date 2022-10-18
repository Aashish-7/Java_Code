package java_8_forEach_loop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {            // Iterating by passing lambda expression
    public static void main(String[] args) {

        List<String> gamesList = new ArrayList<>();
        gamesList.add("Football");
        gamesList.add("Clash Royale !!");
        gamesList.add("Hockey");
        gamesList.add("Table tennis");
        gamesList.add("Cricket");

        System.out.println("______games list______");
        gamesList.forEach(s -> System.out.println(s));

        System.out.println("____________________________By using for loop ");
        for(String s : gamesList) {
            System.out.println(s);
        }

        System.out.println("_______________print by method reference________--");
        gamesList.forEach(System.out::println);

        // java stream forEachOrdered() method use

        System.out.println("________iterating by passin glambda expression !!");
        gamesList.stream().forEachOrdered(s -> System.out.println(s));

        System.out.println("____________________iterating by passing method references________!!");
        gamesList.stream().forEachOrdered(System.out::println);
    }
}
