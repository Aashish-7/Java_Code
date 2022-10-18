package arrayyt; // odd and even and count of odd and even and sum of odd and even 

import java.util.ArrayList;  // arrange this program and fix it !!!!!!!!!!!

public class OddAndEvenArray {

	public static void main(String[] args) {
		int[] a = { 8, 5, 10, 12, 3, 6, 4 };

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				al1.add(a[i]);
			} else {
				al2.add(a[i]);
			}
		}
		System.out.println("Print Even no are..");
		int total1 = 0;
		for (int no : al1) {

			total1 = total1 = no;
			System.out.println("Even sum is " + total1);
			System.out.print(no + " ");
		}
		System.out.println();
		System.out.println("Print odd no are..");
		for (int no : al2) {
			System.out.print(no + " ");
			System.out.println();
			int total2 = 0;
			total2 = total2 + no;
			System.out.println("Odd sum is " + total2);
		}
		System.out.println();
		System.out.println("Count of no is..");
		System.out.println("no of even no are " + al1.size());
		System.out.println("no of odd no are " + al2.size());

	}

}
