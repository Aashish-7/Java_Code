package controlstmt;

import java.util.Scanner;

public class GreaterThree2 {

	private static Scanner sc;

	public static void main(String[] args) {
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter Numbers...");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a > b) {
				if (a > c) {
					System.out.println(a + " is greater");
				} else
					System.out.println(c + " is greater");
			} else if (b > c) {
				System.out.println(b + " is greater");
			} else
				System.out.println(c + " is greater");
		} catch (Exception e) {
			System.out.println("Invalid digits..");
		}
	}

}
