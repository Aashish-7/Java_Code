package controlstmt;

import java.util.Scanner;

public class SwapNum {
	public static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter first value of a.");
		int a = sc.nextInt();
		System.out.println("Enter second valur of b.");
		int b = sc.nextInt();
		int t;
		t = a;
		a = b;
		b = t;
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
	}

}
