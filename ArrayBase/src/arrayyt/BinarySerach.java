package arrayyt;

import java.util.Scanner;

public class BinarySerach {

	public static void main(String[] args) {
		int[] a = { 2, 5, 7, 9, 12, 24, 44, 57, 89, 90, };
		for (int i = 0; i < a.length; i++) {
			System.out.print(+a[i] + ",");
		}
		System.out.println("\n");

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Which item you find in this list");
		int srch = s.nextInt();
		int li = 0;
		int hi = a.length - 1;
		int mi = (li + hi) / 2;

		while (li <= hi) {
			if (a[mi] == srch) {
				System.out.println("item is " + mi + " index Possition");
				break;
			} else if (a[mi] < srch) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println("Item not found!!");
		}
	}

}
