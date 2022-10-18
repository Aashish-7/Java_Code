import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("HONDA CITY");
		cars.add("MARUTI");
		for (int i = 0; i < cars.size(); i++) {
			// System.out.println(i);
			System.out.println(cars.get(i));
		}
		for (String i : cars) {
			System.out.println(i);
		}
	}

}
