package controlstmt;

import java.util.Scanner;

public class GreaterThree {

	private static Scanner sc;

	public static void main(String[] args) {
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter three no for compare.");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a > b && a > c) {
				System.out.println(a + " is greter.");
			} else if (b > a && b > c) {
				System.out.println(b + " is greater.");
			} else {
				System.out.println(c + " is greater.");
			}
		} catch (Exception e) {
			System.out.println("try again invalid input");
		}
	}

}
