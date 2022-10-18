package java_8_stream;
//This method takes a sequence of input elements and combines them into a single summary result by repeated operation.
// For example, finding the sum of numbers, or accumulating elements into a list.
//In the following example, we are using reduce() method, which is used to sum of all the product prices.

import java.util.ArrayList;
import java.util.List;

class Hotel {
    int id;
    String name;
    String addresss;

    float price;

    public Hotel(int id, String name, String addresss, float price) {
        super();
        this.id = id;
        this.name = name;
        this.addresss = addresss;
        this.price = price;
    }
}

public class JavaStream5 {  //reduce() Method in Collection
    public static void main(String[] args) {

        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(new Hotel(1, "Divine_Inn", "Noida", 1000.45f));
        hotelList.add(new Hotel(2, "Taj_Place", "Mumbai", 3499.54f));
        hotelList.add(new Hotel(3, "&_Sky", "Mzn", 4588.90f));
        hotelList.add(new Hotel(4, "Daba", "Delhi", 6756.33f));

        // this is more compact approach for filtering data
        Float totalPrice = hotelList.stream()
                .map(hotel -> hotel.price)
                .reduce(0.0f, (sum, price) -> sum+price);
        System.out.println(totalPrice);

        //more precious code
//        Float totalPrice2 = hotelList.stream()
//                .map(hotel -> hotel.price)
//                .reduce(0.0f, float::sum);
//
//        System.out.println(totalPrice2);
    }
}
