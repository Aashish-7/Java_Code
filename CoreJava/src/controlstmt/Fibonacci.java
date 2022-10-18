package controlstmt;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digits for print series..");
		int d = sc.nextInt();
		int a = 0, b = 1, c;
		System.out.print(a + " " + b);
		for (int i = 3; i <= d; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}

}
