package controlstmt;

import java.util.Scanner;

public class LeapYear2 {
	public static Scanner sc;

	public static void main(String[] args) {
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter year for checking.");
			int year = sc.nextInt();
			if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)) {
				System.out.println("leap year");
			} else {
				System.out.println("not a leap year");
			}
		} catch (Exception e) {
			System.out.println("invalid year.");
		}
	}

}
