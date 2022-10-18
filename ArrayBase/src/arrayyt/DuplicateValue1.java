package arrayyt; // BY USING SET INTERFACE BECAUSE IT IS NOT STORE DUPLICATE ELEMENTS (PART OF COLLECTION)

// same for brute force method it is limited more than 2 elements

import java.util.Set;
import java.util.HashSet;

public class DuplicateValue1 {

	public static void main(String[] args) {
		int[] a = { 3, 5, 4, 3, 2, 2, 1 };
		System.out.println("Duplicate elements are!!");
		Set<Integer> s = new HashSet<>();
		for (int no : a) {
			if (s.add(no) == false) { // because of boolean value return if add so true else false check false value
										// and print
				System.out.print(no + " ");
			}
		}
	}

}
