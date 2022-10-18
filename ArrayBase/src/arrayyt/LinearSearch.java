package arrayyt;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item which find in array..");
		int item = sc.nextInt();
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				System.out.println("Item is....." + i + " index position...");
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println("Item not found...");
		}
	}

}
