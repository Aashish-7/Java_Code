package arrayyt; // by using hash set

import java.util.HashSet;

public class RemoveDuplicateSorted1 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 5, 4, 5 };

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		for (int no : hs) {
			System.out.println(no);
		}
	}

}
