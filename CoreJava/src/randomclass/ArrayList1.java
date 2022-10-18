import java.util.ArrayList;
public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.set(0, "HONDA");
		cars.remove(1);
		System.out.println(cars.get(0));  // to access an item
//		cars.clear();
		System.out.println(cars.size());
		System.out.println(cars);
		
	}
}
