package controlstmt;

import java.util.Scanner;

public class GreaterTwo {

	private static Scanner sc;

	public static void main(String[] args) {
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter no for compare:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a > b)
				System.out.println(a + " ,a is greater..");
			else
				System.out.println(b + " ,b is greater..");
		} catch (Exception e) {
			System.out.println("Invalaid input..");
		}
	}
}
