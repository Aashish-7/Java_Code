package controlstmt;

import java.util.Scanner;

public class SwapNum2 {
	public static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter first no  for swapping.");
		int a = sc.nextInt();
		System.out.println("Enter second no for swapping.");
		int b = sc.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
	}

}
