import java.util.ArrayList;
import java.util.Iterator;

public class IteratorJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Cars = new ArrayList<String>();

		Cars.add("Volov0");
		Cars.add("Honda");
		Cars.add("BMW");
		Cars.add("Ford");
		// get the iterator
		Iterator<String> it = Cars.iterator();
		// print the first item
		System.out.println(it.next());
	}

}
