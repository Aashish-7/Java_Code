package controlstmt;

import java.util.Scanner;

public class LeapYear {

	private static Scanner sc;

	public static void main(String[] args) {
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter leap to check year.");
			int year = sc.nextInt();
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						System.out.println("leap year.");
					} else {
						System.out.println("not a leap year.");
					}
				} else {
					System.out.println("leap year.");
				}
			} else {
				System.out.println("not a leap year");
			}
		} catch (Exception e) {
			System.out.println("Invalid year.");
		}
	}

}
