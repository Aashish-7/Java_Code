package arrayyt;

import java.util.Scanner;

public class LinearSearch1 {

	public static void main(String[] args) {
		String[] a = { "aashish", "shivam", "aman", "ankur" };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Which item you find in present array");
		String item = s.nextLine();
		int temp = 0;

		for (int j = 0; j < a.length; j++) {
			if (a[j].equals(item)) {
				System.out.println("item is " + j + " index position");
				temp = temp + 1;

			}
		}
		if (temp == 0) {
			System.out.println("Item not found!!");
		}
	}

}
