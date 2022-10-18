package excptnhndlg;

import java.util.Scanner;

@SuppressWarnings("serial")
class UnderAgeException extends Exception {
	UnderAgeException(String msg) {
		super(msg);
	}

	UnderAgeException() {
		System.out.println("you are not eligible for voting");
	}
}

public class Voting1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your age for voting.");
		int a = sc.nextInt();
		try { // use try catch or throws in method for handle compile time exception
			if (a < 18) {
				throw new UnderAgeException(); // use any msg
			} else {
				System.out.println("Please vote.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
