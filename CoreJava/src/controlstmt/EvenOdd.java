package controlstmt;

import java.util.Scanner;

public class EvenOdd {

	private static Scanner sc;

	public static void main(String[] args) {
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter no for check odd and even");
			int no = sc.nextInt();
			if (no % 2 == 0) {
				System.out.println("No is Even");
			} else {
				System.out.println("No is Odd");
			}
		} catch (Exception e) {
			System.out.println("Invalid digits..");
		}
	}

}
