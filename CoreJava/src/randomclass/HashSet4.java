
// Import the HashSet class
import java.util.HashSet;

public class HashSet4 {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		cars.clear();
		System.out.println(cars);
	}
}
