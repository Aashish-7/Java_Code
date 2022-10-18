package controlstmt;

import java.util.Scanner;

public class CheckPalindrom {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to check palindrom.");
		int no = sc.nextInt();
		int temp = no;
		int rev = 0, rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (no == rev) {
			System.out.println("No is palindrom");
		} else {
			System.out.println("No is not palindrom");
		}
	}

}
