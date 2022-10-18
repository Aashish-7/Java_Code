package controlstmt;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no for find reverse.");
		int no = sc.nextInt();
		int rem, rev = 0;
		while (no != 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println(rev);
	}

}
