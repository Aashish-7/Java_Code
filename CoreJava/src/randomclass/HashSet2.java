
// Import the HashSet class
import java.util.HashSet;

public class HashSet2 {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println(cars.contains("Mazda"));
	}
}

//To check whether an item exists in a HashSet, use the contains() method: