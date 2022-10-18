package controlstmt;

import java.util.Scanner;

public class UserInput {
	public static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your gender");
		char gender = sc.next().charAt(0);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your phone no");
		long phone = sc.nextLong();
		System.out.println("Your Name is: " + name);
		System.out.println("Your Gender is: " + gender);
		System.out.println("Your age is: " + age);
		System.out.println("Your phone no is: " + phone);
	}

}
