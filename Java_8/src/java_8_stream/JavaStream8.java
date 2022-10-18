package java_8_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Mouse {
    int id ;
    String brand;
    float price;

    public Mouse(int id, String brand, float price) {
        super();
        this.id = id;
        this.brand = brand;
        this.price = price;
    }
}


//stream allows you to collect your result in any various forms.
//You can get you result as set, list or map and can perform manipulation on the elements.

public class JavaStream8 {  // convert list into set
    public static void main(String[] args) {

        List<Mouse> mouseList = new ArrayList<>();

        mouseList.add(new Mouse(1, "HP", 200));
        mouseList.add(new Mouse(2, "Asur", 300));
        mouseList.add(new Mouse(3,"Dell", 400));
        mouseList.add(new Mouse(4, "Asur", 500));
        mouseList.add(new Mouse(5, "Honor", 600));

        // converting list into set
        Set<Float> mousePriceList = mouseList.stream()
                .filter(mouse -> mouse.price<500)   // filter product on the basic of price
                .map(mouse -> mouse.price)
                .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)

        System.out.println(mousePriceList);

    }
}
