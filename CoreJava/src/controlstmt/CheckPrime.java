package controlstmt;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int no = sc.nextInt();
		int temp = 0;
		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp = temp + i;
			}
		}
		if (temp > 0) {
			System.out.println("Not prime.");
		} else {
			System.out.println("No is prime.");
		}
	}

}
