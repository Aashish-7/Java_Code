package collectionjavayt; // confusing program

import java.util.ArrayList;

public class ArrayListDemo3 {
	public static void main(String[] args) {

		int[] a = { 2, 3, 4, 5, 1, 2 };

		ArrayList a1 = new ArrayList();
		for (int i = 0; i < a.length; i++) {
			a1.add(a[i]);
		}
		System.out.println(a1);

		ArrayList a2 = new ArrayList();
		for (int j = 0; j < a.length; j++) {
			a2.add(a[j]);
		}
		System.out.println(a2);

		a1.removeAll(a2);
		System.out.println(a1);

	}
}
